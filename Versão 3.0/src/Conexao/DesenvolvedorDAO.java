package Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class DesenvolvedorDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<DesenvolvedorDTO> lista = new ArrayList<>();
    public int conectado = 0;

//
//********************************************* CADASTRA DESENVOLVEDOR *********************************************
//
    public void cadastrarDesenvolvedor(DesenvolvedorDTO objDesenvolvedorDTO) {
        String sql = "INSERT INTO colaboradores (Nome, Email, Senha, CidadeID) "
                + "VALUES (?, ?, ?, ?)";
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, objDesenvolvedorDTO.getNome());
            pstm.setString(2, objDesenvolvedorDTO.getEmail());
            pstm.setString(3, objDesenvolvedorDTO.getSenha());
            pstm.setInt(4, objDesenvolvedorDTO.getCidadeID());

            pstm.executeUpdate();

            ResultSet generatedKeys = pstm.getGeneratedKeys();
            if (generatedKeys.next()) {
                objDesenvolvedorDTO.setDesenvolvedorID(generatedKeys.getInt(1));
            }

            JOptionPane.showMessageDialog(null, "Desenvolvedor cadastrado com sucesso!", "Alerta",
                    JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar desenvolvedor: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

//
//**************************************** ALTERA DADOS DO DESENVOLVEDOR ****************************************
//
    public boolean atualizarDesenvolvedor(DesenvolvedorDTO devDTO) {
        String sql = "UPDATE colaboradores "
                + "SET Nome = ?, Email = ?, Senha = ?, CidadeID = ? "
                + "WHERE ColaboradorID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, devDTO.getNome());
            pstm.setString(2, devDTO.getEmail());
            pstm.setString(3, devDTO.getSenha());
            pstm.setInt(4, devDTO.getCidadeID());
            pstm.setInt(5, devDTO.getDesenvolvedorID());

            System.out.println("Nome: " + devDTO.getNome());
            System.out.println("Email: " + devDTO.getEmail());
            System.out.println("Senha: " + devDTO.getSenha());
            System.out.println("Cidade ID: " + devDTO.getCidadeID());
            System.out.println("Colaborador ID: " + devDTO.getDesenvolvedorID());

            int rowsAffected = pstm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar desenvolvedor: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

//
//********************************************* DELETA DESENVOLVEDOR *********************************************
//
    public void ExcluirDesenvolvedor(int DevID, String Nome) {
        String sqlAlteraNomeCriador = "UPDATE projetos SET Nome_Criador = CONCAT (Nome_Criador, '(desativado)') WHERE Nome_Criador = ?";
        String sqlModificaContribuicao = "UPDATE contribuicoes_de_codigo SET ColaboradorID = 1 WHERE ColaboradorID = ?";
        String sqlDeleteAssociacao = "DELETE FROM associacao_colaborador_linguagem WHERE ColaboradorID = ?";
        String sqlDeleteColaboradores = "DELETE FROM colaboradores WHERE ColaboradorID = ?";

        conn = Conexao.getConexao();
        try {
            //Modifica o Criador do projeto para adicionar o (desativado)
            pstm = conn.prepareCall(sqlAlteraNomeCriador);
            pstm.setString(1, Nome);
            pstm.executeUpdate();

            //Modifica as contribuicoes que o dev já fez
            pstm = conn.prepareCall(sqlModificaContribuicao);
            pstm.setInt(1, DevID);
            pstm.executeUpdate();

            // Exclui os registros da tabela associada primeiro
            pstm = conn.prepareStatement(sqlDeleteAssociacao);
            pstm.setInt(1, DevID);
            pstm.executeUpdate();

            // Em seguida, exclui o registro do desenvolvedor
            pstm = conn.prepareStatement(sqlDeleteColaboradores);
            pstm.setInt(1, DevID);
            pstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Conta excluída com sucesso!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir conta: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

//
//********************************** CADASTRA LINGUAGEM E PROEFICIENCIA DO DEV ************************************
//
    public void cadastrarLinguagemProeficiencia(DesenvolvedorDTO objDesenvolvedorDTO) {
        String verificaSql = "SELECT COUNT(*) FROM associacao_colaborador_linguagem "
                + "WHERE ColaboradorID = ? "
                + "AND LinguagemID = ?";

        String insertSql = "INSERT INTO associacao_colaborador_linguagem (ColaboradorID, LinguagemID, ProeficienciaID) "
                + "VALUES (?, ?, ?)";
        conn = Conexao.getConexao();

        try {
            // Verificar se a combinação já existe
            pstm = conn.prepareStatement(verificaSql);
            pstm.setInt(1, objDesenvolvedorDTO.getDesenvolvedorID());
            pstm.setInt(2, objDesenvolvedorDTO.getLinguagemEscolhidaID());
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, """
                                                        Linguagem e proeficiencia já cadastrada
                                                        Caso queira corrigir algo, exclua a linguagem e cadastre-a novamente""",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            pstm.close();

            // Se não existir, insere a nova combinação
            pstm = conn.prepareStatement(insertSql);
            pstm.setInt(1, objDesenvolvedorDTO.getDesenvolvedorID());
            pstm.setInt(2, objDesenvolvedorDTO.getLinguagemEscolhidaID());
            pstm.setInt(3, objDesenvolvedorDTO.getProeficienciaID());

            pstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Linguagem e proeficiência cadastradas com sucesso!",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Linguagem de programação e proeficiência: "
                    + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
//
//********************************** EXCLUI LINGUAGEM E PROEFICIENCIA DO DEV ************************************
//

    public void DescadastrarLinguagemProeficiencia(String NomeDaLinguagem, int colaboradorID) {
        String sqlDescobreLinguagemSelecionada = "SELECT LinguagemID FROM linguagens_de_programacao WHERE Nome_da_Linguagem = ?";
        String sqlExcluiLinguagemSelecionada = "DELETE FROM associacao_colaborador_linguagem WHERE ColaboradorID = ? AND LinguagemID = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConexao();

            // Obter LinguagemID
            pstm = conn.prepareStatement(sqlDescobreLinguagemSelecionada);
            pstm.setString(1, NomeDaLinguagem);
            rs = pstm.executeQuery();

            int linguagemID = -1;
            if (rs.next()) {
                linguagemID = rs.getInt("LinguagemID");
            } else {
                JOptionPane.showMessageDialog(null, "Linguagem não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Excluir associação
            pstm = conn.prepareStatement(sqlExcluiLinguagemSelecionada);
            pstm.setInt(1, colaboradorID);
            pstm.setInt(2, linguagemID);
            pstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Linguagem excluída com sucesso!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir linguagem: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
//
//******************************************** LISTA LINGUAGEM DO DEV **********************************************
//

    public List<DesenvolvedorDTO> listarLinguagensEProeficiencias(int colaboradorID) {
        List<DesenvolvedorDTO> lista = new ArrayList<>();
        /*
    O código SQL abaixo realiza uma consulta para recuperar informações sobre as linguagens de programação
    e os níveis de proficiência associados a um colaborador específico.

    Seleciona as seguintes colunas:
        - acl.LinguagemID: ID da linguagem de programação associada ao colaborador.
        - acl.ProeficienciaID: ID do nível de proficiência associado à linguagem de programação para o colaborador.
        - l.Nome_da_Linguagem AS LinguagemNome: Nome da linguagem de programação (renomeado para maior clareza).
        - p.Nivel_Proeficiencia AS ProeficienciaNivel: Nível de proficiência associado à linguagem de programação (
          renomeado para maior clareza).

    Realiza a junção das seguintes tabelas:
        - associacao_colaborador_linguagem (acl)
        - linguagens_de_programacao (l)
        - proeficiencia (p)

    Filtra os resultados com base no ID do colaborador fornecido.
         */
        String sql = "SELECT acl.LinguagemID, acl.ProeficienciaID, l.Nome_da_Linguagem AS LinguagemNome, p.Nivel_Proeficiencia AS ProeficienciaNivel "
                + "FROM associacao_colaborador_linguagem acl "
                + "JOIN linguagens_de_programacao l ON acl.LinguagemID = l.LinguagemID "
                + "JOIN proeficiencia p ON acl.ProeficienciaID = p.ID_Proeficiencia "
                + "WHERE acl.ColaboradorID = ?";

        Connection conn = Conexao.getConexao();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, colaboradorID);
            rs = pstm.executeQuery();

            while (rs.next()) {
                DesenvolvedorDTO devDTO = new DesenvolvedorDTO();
                devDTO.setLinguagemID(rs.getInt("LinguagemID"));
                devDTO.setProeficienciaID(rs.getInt("ProeficienciaID"));
                devDTO.setNome_da_Linguagem(rs.getString("LinguagemNome"));
                devDTO.setNivelProeficiencia(rs.getString("ProeficienciaNivel"));
                lista.add(devDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar linguagens e proficiências: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        return lista;
    }

//****************************************** LISTA LINGUAGEM DO PROJETO ********************************************
/*
    Aqui é onde a brincadeira fica mais difícil, pois esta parte é dividida em 3 partes pois:
    
    1. com base no valor do Projetos_ID(PK) do projeto cadastrado, ele encontre todas as contribuições
    de código (Contribuição de código (PK)) associadas a ele
    2.nesta contribuição de contribuição de código (Contribuição de código (PK) associada ao Projetos_ID(PK))
    execute um select que liste todas linguagens que este usa (Sem sugestões(FK))
     */
//********************************** PARTE 1: Buscar Contribuições por Projeto *************************************    
    public List<Integer> listarContribuicoesPorProjeto(int projetoID) {
        List<Integer> contribuicoes = new ArrayList<>();
        String sql = "SELECT ContribuicaoID "
                + "FROM contribuicoes_de_codigo "
                + "WHERE ProjetoID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, projetoID);
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    contribuicoes.add(rs.getInt("ContribuicaoID"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contribuições: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
        }

        return contribuicoes;
    }
//********************************** PARTE 2: Listar Linguagens por Contribuição *************************************  

    public Map<Integer, String> listarLinguagensPorContribuicao(int contribuicaoID) {
        Map<Integer, String> linguagens = new HashMap<>();
        String sql = "SELECT l.LinguagemID, l.Nome_da_Linguagem "
                + "FROM associacao_contribuicao_linguagem acl "
                + "JOIN linguagens_de_programacao l "
                + "ON acl.LinguagemID = l.LinguagemID "
                + "WHERE acl.ContribuicaoID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, contribuicaoID);
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    int linguagemID = rs.getInt("LinguagemID");
                    String nomeLinguagem = rs.getString("Nome_da_Linguagem");
                    linguagens.put(linguagemID, nomeLinguagem);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar linguagens: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
        }

        return linguagens;
    }

//********************************************** CADASTRA PROJETO **********************************************
//
//************************************ CADASTRA NOME E DESCRIÇÃO DO PROJETO ************************************
//
    public void cadastrarNomeProjeto(DesenvolvedorDTO objDesenvolvedorDTO) {
        String sql_Projetos = "INSERT INTO projetos (Nome_Projeto, Nome_Criador, Descricao_Projeto) "
                + "VALUES (?, ?, ?)";
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql_Projetos, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, objDesenvolvedorDTO.getNome_do_Projeto());
            pstm.setString(2, objDesenvolvedorDTO.getNome());
            pstm.setString(3, objDesenvolvedorDTO.getDescricao_do_Projeto());

            pstm.executeUpdate();

            ResultSet generatedKeys = pstm.getGeneratedKeys();
            if (generatedKeys.next()) {
                objDesenvolvedorDTO.setProjetoID(generatedKeys.getInt(1));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar desenvolvedor: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //
    //***************************************** CADASTRA CÓDIGO DO PROJETO *****************************************
    //

    public void cadastrarCodigoProjeto(DesenvolvedorDTO objDesenvolvedorDTO) {
        String sql_Codigo = "INSERT INTO contribuicoes_de_codigo (ProjetoID, ColaboradorID, Codigo_Projeto) "
                + "VALUES (?, ?, ?)";
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql_Codigo, Statement.RETURN_GENERATED_KEYS);
            pstm.setInt(1, objDesenvolvedorDTO.getProjetoID());
            pstm.setInt(2, objDesenvolvedorDTO.getDesenvolvedorID());
            pstm.setString(3, objDesenvolvedorDTO.getCodigo_do_Projeto());

            pstm.executeUpdate();

            ResultSet generatedKeys = pstm.getGeneratedKeys();
            if (generatedKeys.next()) {
                objDesenvolvedorDTO.setContribuicaoID(generatedKeys.getInt(1));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a linguagem de programação do seu Código: "
                    + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

//
//**************************************** CADASTRA LINGUAGENS DO PROJETO ******************************************
//
    public void cadastrarLinguagemProjeto(DesenvolvedorDTO devDTO) {
        String sql = "INSERT INTO associacao_contribuicao_linguagem (ContribuicaoID, LinguagemID) "
                + "VALUES (?, ?)";

        Connection conn = Conexao.getConexao();
        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, devDTO.getContribuicaoID());
            pstm.setInt(2, devDTO.getLinguagemEscolhidaID());
            pstm.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar linguagem: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

//************************************************ ATUALIZA PROJETO ************************************************    
//
//************************************** ATUALIZA NOME E DESCRIÇÃO DO PROJETO **************************************
//
    public boolean atualizarProjeto(DesenvolvedorDTO devDTO) {
        String sql = "UPDATE projetos "
                + "SET Nome_Projeto = ?, Descricao_Projeto = ? "
                + "WHERE ProjetoID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, devDTO.getNome_do_Projeto());
            pstm.setString(2, devDTO.getDescricao_do_Projeto());
            pstm.setInt(3, devDTO.getProjetoID());

            int rowsAffected = pstm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar projeto: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
//
//*********************************************** CÓDIGO DO PROJETO ************************************************
//

    public boolean atualizarContribuicao(DesenvolvedorDTO devDTO) {
        String sql = "UPDATE contribuicoes_de_codigo "
                + "SET Codigo_Projeto = ?, ColaboradorID = ?,Data_Contribuicao = CURRENT_TIMESTAMP "
                + "WHERE ProjetoID = ?";
        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, devDTO.getCodigo_do_Projeto());
            pstm.setInt(2, devDTO.getDesenvolvedorID());
            JOptionPane.showMessageDialog(null, devDTO.getDesenvolvedorID());
            pstm.setInt(3, devDTO.getProjetoID());

            int rowsAffected = pstm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar contribuição: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

//
//***************************************** LISTA LINGUAGENS DO PROJETO ********************************************
//
    public void ListaInformacoesProjeto(DesenvolvedorDTO devDTO) {
        String sql = "SELECT Nome_Projeto, Descricao_Projeto, Codigo_Projeto, ContribuicaoID "
                + "FROM projetos "
                + "JOIN contribuicoes_de_codigo "
                + "ON projetos.ProjetoID = contribuicoes_de_codigo.ProjetoID "
                + "WHERE projetos.ProjetoID = ?";

        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, devDTO.getProjetoID());
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                devDTO.setNome_do_Projeto(rs.getString("Nome_Projeto"));
                devDTO.setDescricao_do_Projeto(rs.getString("Descricao_Projeto"));
                devDTO.setCodigo_do_Projeto(rs.getString("Codigo_Projeto"));
                devDTO.setContribuicaoID(rs.getInt("ContribuicaoID"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar informações do projeto: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(), "Alerta",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

//
//**************************************** EXCLUI LINGUAGENS DO PROJETO ******************************************
//    
    public boolean excluirLinguagemProjeto(DesenvolvedorDTO devDTO) {
        String sql = "DELETE FROM associacao_contribuicao_linguagem "
                + "WHERE ContribuicaoID = ? "
                + "AND LinguagemID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, devDTO.getContribuicaoID());
            pstm.setInt(2, devDTO.getLinguagemID());

            int rowsAffected = pstm.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir linguagem do projeto: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

//************************************************* EXCLUI PROJETO *************************************************    
//
//****************************** DELETA TABELA DE ASSOCIAÇÃO CONTRIBUIÇÃO E LINGUAGEM ******************************
//
    public boolean excluirAssociacoesPorProjeto(int projetoID) {
        String sql = "DELETE FROM associacao_contribuicao_linguagem "
                + "WHERE ContribuicaoID "
                + "IN (SELECT ContribuicaoID FROM contribuicoes_de_codigo WHERE ProjetoID = ?)";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, projetoID);
            int rowsAffected = pstm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir associações: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
//
//************************************ DELETA TABELA DE COTRIBUIÇÕES DE CÓDIGO ************************************
//    

    public boolean excluirContribuicoesPorProjeto(int projetoID) {
        String sql = "DELETE FROM contribuicoes_de_codigo "
                + "WHERE ProjetoID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, projetoID);
            int rowsAffected = pstm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir contribuições: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
//
//******************************************* DELETA TABELA DE PROJETOS *******************************************
//    

    public boolean excluirProjeto(int projetoID) {
        String sql = "DELETE FROM projetos "
                + "WHERE ProjetoID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, projetoID);
            int rowsAffected = pstm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir projeto: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

//
//*********************************************** LOGA DESENVOLVEDOR ***********************************************
//
    public DesenvolvedorDTO loginDesenvolvedor(String email, String senha) {
        String sql = "SELECT ColaboradorID, Nome, Email, CidadeID "
                + "FROM colaboradores "
                + "WHERE Email = ? AND Senha = ?";

        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, email);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();

            if (rs.next()) {
                DesenvolvedorDTO desenvolvedor = new DesenvolvedorDTO();
                desenvolvedor.setDesenvolvedorID(rs.getInt("ColaboradorID"));
                desenvolvedor.setNome(rs.getString("Nome"));
                desenvolvedor.setEmail(rs.getString("Email"));
                desenvolvedor.setCidadeID(rs.getInt("CidadeID"));
                conectado = 1;
                return desenvolvedor;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado, tente novamente!", "Alerta",
                JOptionPane.ERROR_MESSAGE);
        return null; // Se não encontrar nenhum desenvolvedor com o email e senha fornecidos
    }

//  
// 
//  A PARTIR DAQUI SÃO OS MÉTODOS COMPLEMENTARES, ELES AGREGAM FUNCIONALIDADE AO CÓDIGO, DEIXANDO-O MAIS FUNCIONAL
//
// 
//*********************************** LISTA LINGUAGEM E PROEFICIENCIA DO USUARIO ***********************************
//
// 
//*********************************** CARREGA COMBOBOX LINGUAGEM DE PROGRAMAÇÃO ***********************************
//
    public ResultSet carregarLinguagensProgramacao() {
        String sql = "SELECT LinguagemID, nome_da_linguagem "
                + "FROM linguagens_de_programacao";

        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Linguagens de Programação: " + e,
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
//
//************************************ CARREGA COMBOBOX NÍVEL DE PROEFICIENCIA ************************************
//   

    public ResultSet carregarNivelProeficiencia() {
        String sql = "SELECT ID_Proeficiencia, Nivel_Proeficiencia "
                + "FROM proeficiencia";

        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Nível de Proficiência: " + e,
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
//
//******************************************** CARREGA COMBOBOX ESTADO ********************************************
//          

    public ResultSet carregarComboBoxEstado() {
        String sql = "SELECT EstadoID, nome_do_Estado "
                + "FROM estados";
        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Estado: " + e, "Alerta",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
//
//******************************************** CARREGA COMBOBOX CIDADE ********************************************
//   

    public ResultSet carregarComboBoxCidade(int estadoID) {
        String sql = "SELECT CidadeID, nome_da_Cidade FROM cidades "
                + "WHERE EstadoID = ? "
                + "order by Nome_da_Cidade";
        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, estadoID);
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Cidade: " + e, "Alerta",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

//**************************************** CARREGA OS PROJETOS NA TABELA ****************************************
//****************************************** PARTE 1: LISTAR PROJETOS *******************************************
    public List<DesenvolvedorDTO> listarProjetos() {
        List<DesenvolvedorDTO> projetos = new ArrayList<>();
        String sql = "SELECT ProjetoID, Nome_Projeto, Nome_Criador "
                + "FROM projetos";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                DesenvolvedorDTO devDTO = new DesenvolvedorDTO();
                devDTO.setProjetoID(rs.getInt("ProjetoID"));
                devDTO.setNome_do_Projeto(rs.getString("Nome_Projeto"));
                devDTO.setNomeCriador(rs.getString("Nome_Criador"));
                projetos.add(devDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar projetos: " + e.getMessage(), "Alerta",
                    JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("Total de projetos encontrados: " + projetos.size());
        return projetos;
    }
//
//************************************** PARTE 2: BUSCAR ULTIMA CONTRIBUIÇÃO ***************************************  

    public DesenvolvedorDTO buscarUltimaContribuicaoPorProjeto(int projetoID) {
        DesenvolvedorDTO contribuicao = null;
        String sql = "SELECT ColaboradorID, Data_Contribuicao "
                + "FROM contribuicoes_de_codigo "
                + "WHERE ProjetoID = ? "
                + "ORDER BY Data_Contribuicao DESC "
                + "LIMIT 1";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, projetoID);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    contribuicao = new DesenvolvedorDTO();
                    contribuicao.setDesenvolvedorID(rs.getInt("ColaboradorID"));
                    contribuicao.setDataContribuicao(rs.getString("Data_Contribuicao"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar última contribuição: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("Última contribuição encontrada para o projetoID " + projetoID + ": " + (contribuicao != null ? contribuicao.getDataContribuicao() : "N/A"));
        return contribuicao;
    }
//
//********************************** PARTE 3: BUSCAR QUEM MODIFICOU POR ULTIMO *********************************** 

    public String buscarNomeColaboradorPorID(int colaboradorID) {
        String nome = null;
        String sql = "SELECT Nome FROM colaboradores "
                + "WHERE ColaboradorID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, colaboradorID);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    nome = rs.getString("Nome");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do colaborador: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("Nome do colaborador encontrado para o colaboradorID " + colaboradorID + ": " + nome);
        return nome;
    }
//
//**************************************** LISTAR DADOS DO DESENVOLVEDOR ***************************************** 

    public DesenvolvedorDTO ListaInformacoesDesenvolvedor(int Colaborador) {
        String sql = "SELECT Nome, Email, Senha, Nome_da_Cidade, Nome_do_Estado "
                + "FROM colaboradores "
                + "JOIN cidades ON colaboradores.CidadeID = cidades.CidadeID "
                + "JOIN estados ON cidades.EstadoID = estados.EstadoID "
                + "WHERE colaboradores.ColaboradorID = ?";

        try (Connection conn = Conexao.getConexao(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setInt(1, Colaborador);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    DesenvolvedorDTO devDTO = new DesenvolvedorDTO();
                    devDTO.setNome(rs.getString("Nome"));
                    devDTO.setEmail(rs.getString("Email"));
                    devDTO.setSenha(rs.getString("Senha"));
                    devDTO.setCidade(rs.getString("Nome_da_Cidade"));
                    devDTO.setEstado(rs.getString("Nome_do_Estado"));
                    return devDTO;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar informações do colaborador: " + e.getMessage(),
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

}
