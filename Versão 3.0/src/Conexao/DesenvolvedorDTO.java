package Conexao;

import java.util.List;


public class DesenvolvedorDTO 
{
    private String nome, email, senha, NomeCriador; 
    private String Nome_do_Projeto, Descricao_do_Projeto, Codigo_do_Projeto, Comentario_do_Projeto; 
    private int ProjetoID, DesenvolvedorID, ContribuicaoID;
    private List<String> linguagens;
    
    private String Nome_da_Linguagem, nivelProeficiencia, cidade, estado, DataContribuicao;
    private int LinguagemID, ProeficienciaID, CidadeID, LinguagemEscolhidaID;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    public List<String> getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(List<String> linguagens) {
        this.linguagens = linguagens;
    }
    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the Nome_do_Projeto
     */
    public String getNome_do_Projeto() {
        return Nome_do_Projeto;
    }

    /**
     * @param Nome_do_Projeto the Nome_do_Projeto to set
     */
    public void setNome_do_Projeto(String Nome_do_Projeto) {
        this.Nome_do_Projeto = Nome_do_Projeto;
    }

    /**
     * @return the Descricao_do_Projeto
     */
    public String getDescricao_do_Projeto() {
        return Descricao_do_Projeto;
    }

    /**
     * @param Descricao_do_Projeto the Descricao_do_Projeto to set
     */
    public void setDescricao_do_Projeto(String Descricao_do_Projeto) {
        this.Descricao_do_Projeto = Descricao_do_Projeto;
    }

    /**
     * @return the Codigo_do_Projeto
     */
    public String getCodigo_do_Projeto() {
        return Codigo_do_Projeto;
    }

    /**
     * @param Codigo_do_Projeto the Codigo_do_Projeto to set
     */
    public void setCodigo_do_Projeto(String Codigo_do_Projeto) {
        this.Codigo_do_Projeto = Codigo_do_Projeto;
    }

    /**
     * @return the ProjetoID
     */
    public int getProjetoID() {
        return ProjetoID;
    }

    /**
     * @param ProjetoID the ProjetoID to set
     */
    public void setProjetoID(int ProjetoID) {
        this.ProjetoID = ProjetoID;
    }

    /**
     * @return the DesenvolvedorID
     */
    public int getDesenvolvedorID() {
        return DesenvolvedorID;
    }

    /**
     * @param DesenvolvedorID the DesenvolvedorID to set
     */
    public void setDesenvolvedorID(int DesenvolvedorID) {
        this.DesenvolvedorID = DesenvolvedorID;
    }

    /**
     * @return the Nome_da_Linguagem
     */
    public String getNome_da_Linguagem() {
        return Nome_da_Linguagem;
    }

    /**
     * @param Nome_da_Linguagem the Nome_da_Linguagem to set
     */
    public void setNome_da_Linguagem(String Nome_da_Linguagem) {
        this.Nome_da_Linguagem = Nome_da_Linguagem;
    }

    /**
     * @return the nivelProeficiencia
     */
    public String getNivelProeficiencia() {
        return nivelProeficiencia;
    }

    /**
     * @param nivelProeficiencia the nivelProeficiencia to set
     */
    public void setNivelProeficiencia(String nivelProeficiencia) {
        this.nivelProeficiencia = nivelProeficiencia;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the LinguagemID
     */
    public int getLinguagemID() {
        return LinguagemID;
    }

    /**
     * @param LinguagemID the LinguagemID to set
     */
    public void setLinguagemID(int LinguagemID) {
        this.LinguagemID = LinguagemID;
    }

    /**
     * @return the ProeficienciaID
     */
    public int getProeficienciaID() {
        return ProeficienciaID;
    }

    /**
     * @param ProeficienciaID the ProeficienciaID to set
     */
    public void setProeficienciaID(int ProeficienciaID) {
        this.ProeficienciaID = ProeficienciaID;
    }

    /**
     * @return the CidadeID
     */
    public int getCidadeID() {
        return CidadeID;
    }

    /**
     * @param CidadeID the CidadeID to set
     */
    public void setCidadeID(int CidadeID) {
        this.CidadeID = CidadeID;
    }

    /**
     * @return the LinguagemEscolhidaID
     */
    public int getLinguagemEscolhidaID() {
        return LinguagemEscolhidaID;
    }

    /**
     * @param LinguagemEscolhidaID the LinguagemEscolhidaID to set
     */
    public void setLinguagemEscolhidaID(int LinguagemEscolhidaID) {
        this.LinguagemEscolhidaID = LinguagemEscolhidaID;
    }

    /**
     * @return the Comentario_do_Projeto
     */
    public String getComentario_do_Projeto() {
        return Comentario_do_Projeto;
    }

    /**
     * @param Comentario_do_Projeto the Comentario_do_Projeto to set
     */
    public void setComentario_do_Projeto(String Comentario_do_Projeto) {
        this.Comentario_do_Projeto = Comentario_do_Projeto;
    }

    /**
     * @return the ContribuicaoID
     */
    public int getContribuicaoID() {
        return ContribuicaoID;
    }

    /**
     * @param ContribuicaoID the ContribuicaoID to set
     */
    public void setContribuicaoID(int ContribuicaoID) {
        this.ContribuicaoID = ContribuicaoID;
    }

    /**
     * @return the DataContribuicao
     */
    public String getDataContribuicao() {
        return DataContribuicao;
    }

    /**
     * @param DataContribuicao the DataContribuicao to set
     */
    public void setDataContribuicao(String DataContribuicao) {
        this.DataContribuicao = DataContribuicao;
    }

    /**
     * @return the NomeCriador
     */
    public String getNomeCriador() {
        return NomeCriador;
    }

    /**
     * @param NomeCriador the NomeCriador to set
     */
    public void setNomeCriador(String NomeCriador) {
        this.NomeCriador = NomeCriador;
    }

    

    
    

    
}
