-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18/05/2024 às 02:21
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sigecom`
--
CREATE DATABASE IF NOT EXISTS `sigecom` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `sigecom`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `associacao_colaborador_linguagem`
--

DROP TABLE IF EXISTS `associacao_colaborador_linguagem`;
CREATE TABLE `associacao_colaborador_linguagem` (
  `AssocID` int(11) NOT NULL,
  `ColaboradorID` int(11) NOT NULL,
  `LinguagemID` int(11) NOT NULL,
  `ProeficienciaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `associacao_colaborador_linguagem`
--

INSERT INTO `associacao_colaborador_linguagem` (`AssocID`, `ColaboradorID`, `LinguagemID`, `ProeficienciaID`) VALUES
(22, 22, 6, 1),
(23, 22, 4, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `associacao_contribuicao_linguagem`
--

DROP TABLE IF EXISTS `associacao_contribuicao_linguagem`;
CREATE TABLE `associacao_contribuicao_linguagem` (
  `Assoc_Contrib_ID` int(11) NOT NULL,
  `ContribuicaoID` int(11) NOT NULL,
  `LinguagemID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `associacao_contribuicao_linguagem`
--

INSERT INTO `associacao_contribuicao_linguagem` (`Assoc_Contrib_ID`, `ContribuicaoID`, `LinguagemID`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `cidades`
--

DROP TABLE IF EXISTS `cidades`;
CREATE TABLE `cidades` (
  `CidadeID` int(11) NOT NULL,
  `Nome_da_Cidade` varchar(100) DEFAULT NULL,
  `EstadoID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cidades`
--

INSERT INTO `cidades` (`CidadeID`, `Nome_da_Cidade`, `EstadoID`) VALUES
(1, 'Rio Branco', 1),
(2, 'Cruzeiro do Sul', 1),
(3, 'Sena Madureira', 1),
(4, 'Senador Guiomard', 1),
(5, 'Tarauacá', 1),
(6, 'Maceió', 2),
(7, 'Arapiraca', 2),
(8, 'Rio Largo', 2),
(9, 'Palmeira dos Índios', 2),
(10, 'São Miguel dos Campos', 2),
(11, 'Macapá', 3),
(12, 'Santana', 3),
(13, 'Laranjal do Jari', 3),
(14, 'Oiapoque', 3),
(15, 'Mazagão', 3),
(16, 'Manaus', 4),
(17, 'Parintins', 4),
(18, 'Itacoatiara', 4),
(19, 'Manacapuru', 4),
(20, 'Coari', 4),
(21, 'Salvador', 5),
(22, 'Feira de Santana', 5),
(23, 'Vitória da Conquista', 5),
(24, 'Camaçari', 5),
(25, 'Itabuna', 5),
(26, 'Fortaleza', 6),
(27, 'Caucaia', 6),
(28, 'Juazeiro do Norte', 6),
(29, 'Maracanaú', 6),
(30, 'Sobral', 6),
(31, 'Brasília', 7),
(32, 'Ceilândia', 7),
(33, 'Gama', 7),
(34, 'Taguatinga', 7),
(35, 'Planaltina', 7),
(36, 'Vitória', 8),
(37, 'Vila Velha', 8),
(38, 'Serra', 8),
(39, 'Cariacica', 8),
(40, 'Cachoeiro de Itapemirim', 8),
(41, 'Goiânia', 9),
(42, 'Aparecida de Goiânia', 9),
(43, 'Anápolis', 9),
(44, 'Rio Verde', 9),
(45, 'Luziânia', 9),
(46, 'São Luís', 10),
(47, 'Imperatriz', 10),
(48, 'São José de Ribamar', 10),
(49, 'Timon', 10),
(50, 'Caxias', 10),
(51, 'Cuiabá', 11),
(52, 'Várzea Grande', 11),
(53, 'Rondonópolis', 11),
(54, 'Sinop', 11),
(55, 'Tangará da Serra', 11),
(56, 'Campo Grande', 12),
(57, 'Dourados', 12),
(58, 'Três Lagoas', 12),
(59, 'Corumbá', 12),
(60, 'Ponta Porã', 12),
(61, 'Belo Horizonte', 13),
(62, 'Uberlândia', 13),
(63, 'Contagem', 13),
(64, 'Juiz de Fora', 13),
(65, 'Betim', 13),
(66, 'Belém', 14),
(67, 'Ananindeua', 14),
(68, 'Santarém', 14),
(69, 'Marabá', 14),
(70, 'Castanhal', 14),
(71, 'João Pessoa', 15),
(72, 'Campina Grande', 15),
(73, 'Santa Rita', 15),
(74, 'Patos', 15),
(75, 'Bayeux', 15),
(76, 'Curitiba', 16),
(77, 'Londrina', 16),
(78, 'Maringá', 16),
(79, 'Ponta Grossa', 16),
(80, 'Cascavel', 16),
(81, 'Recife', 17),
(82, 'Jaboatão dos Guararapes', 17),
(83, 'Olinda', 17),
(84, 'Caruaru', 17),
(85, 'Petrolina', 17),
(86, 'Teresina', 18),
(87, 'Parnaíba', 18),
(88, 'Picos', 18),
(89, 'Piripiri', 18),
(90, 'Campo Maior', 18),
(91, 'Rio de Janeiro', 19),
(92, 'São Gonçalo', 19),
(93, 'Duque de Caxias', 19),
(94, 'Nova Iguaçu', 19),
(95, 'Niterói', 19),
(96, 'Natal', 20),
(97, 'Mossoró', 20),
(98, 'Parnamirim', 20),
(99, 'São Gonçalo do Amarante', 20),
(100, 'Ceará-Mirim', 20),
(101, 'Porto Alegre', 21),
(102, 'Caxias do Sul', 21),
(103, 'Pelotas', 21),
(104, 'Canoas', 21),
(105, 'Santa Maria', 21),
(106, 'Porto Velho', 22),
(107, 'Ji-Paraná', 22),
(108, 'Ariquemes', 22),
(109, 'Vilhena', 22),
(110, 'Cacoal', 22),
(111, 'Boa Vista', 23),
(112, 'Rorainópolis', 23),
(113, 'Caracaraí', 23),
(114, 'Mucajaí', 23),
(115, 'Normandia', 23),
(116, 'Florianópolis', 24),
(117, 'Joinville', 24),
(118, 'Blumenau', 24),
(119, 'São José', 24),
(120, 'Chapecó', 24),
(121, 'São Paulo', 25),
(122, 'Guarulhos', 25),
(123, 'Campinas', 25),
(124, 'São Bernardo do Campo', 25),
(125, 'Santo André', 25),
(126, 'Araçatuba', 25),
(127, 'Birigui', 25),
(128, 'Coroados', 25),
(129, 'Jales', 25),
(130, 'Bauru', 25),
(131, 'São José do Rio Preto', 25),
(132, 'Aracaju', 26),
(133, 'Nossa Senhora do Socorro', 26),
(134, 'Lagarto', 26),
(135, 'Itabaiana', 26),
(136, 'Estância', 26),
(137, 'Palmas', 27),
(138, 'Araguaína', 27),
(139, 'Gurupi', 27),
(140, 'Porto Nacional', 27),
(141, 'Paraíso do Tocantins', 27);

-- --------------------------------------------------------

--
-- Estrutura para tabela `colaboradores`
--

DROP TABLE IF EXISTS `colaboradores`;
CREATE TABLE `colaboradores` (
  `ColaboradorID` int(11) NOT NULL,
  `Nome` varchar(100) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Senha` text NOT NULL,
  `CidadeID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `colaboradores`
--

INSERT INTO `colaboradores` (`ColaboradorID`, `Nome`, `Email`, `Senha`, `CidadeID`) VALUES
(1, 'João Silva', 'joao.silva@example.com', 'senha1', 1),
(2, 'Maria Souza', 'maria.souza@example.com', 'senha2', 2),
(3, 'Pedro Santos', 'pedro.santos@example.com', 'senha3', 3),
(4, 'Ana Lima', 'ana.lima@example.com', 'senha4', 4),
(5, 'Carlos Oliveira', 'carlos.oliveira@example.com', 'senha5', 5),
(17, 'teste', 'teste', 'teste', 13),
(18, 'teste', 'teste', 'teste', 13),
(19, 'teste', 'teste', 'teste', 2),
(20, 'teste', 'teste', 'teste', 2),
(21, 'teste', 'teste', 'teste', 20),
(22, 'teste', 'teste', 'teste', 13);

-- --------------------------------------------------------

--
-- Estrutura para tabela `contribuicoes_de_codigo`
--

DROP TABLE IF EXISTS `contribuicoes_de_codigo`;
CREATE TABLE `contribuicoes_de_codigo` (
  `ContribuicaoID` int(11) NOT NULL,
  `ProjetoID` int(11) DEFAULT NULL,
  `ColaboradorID` int(11) DEFAULT NULL,
  `Data_da_Contribuicao` datetime DEFAULT current_timestamp(),
  `Codigo_Projeto` text DEFAULT NULL,
  `Comentarios` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `contribuicoes_de_codigo`
--

INSERT INTO `contribuicoes_de_codigo` (`ContribuicaoID`, `ProjetoID`, `ColaboradorID`, `Data_da_Contribuicao`, `Codigo_Projeto`, `Comentarios`) VALUES
(1, 1, 1, '2024-05-16 10:00:00', 'Código do Projeto A', 'Comentário sobre o Projeto A'),
(2, 2, 2, '2024-05-13 11:00:00', 'Código do Projeto B', 'Comentário sobre o Projeto B'),
(3, 3, 3, '2024-05-16 12:00:00', 'Código do Projeto C', 'Comentário sobre o Projeto C'),
(4, 4, 4, '2024-05-14 13:00:00', 'Código do Projeto D', 'Comentário sobre o Projeto D'),
(5, 5, 5, '2024-05-15 14:00:00', 'Código do Projeto E', 'Comentário sobre o Projeto E');

-- --------------------------------------------------------

--
-- Estrutura para tabela `estados`
--

DROP TABLE IF EXISTS `estados`;
CREATE TABLE `estados` (
  `EstadoID` int(11) NOT NULL,
  `Nome_do_Estado` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `estados`
--

INSERT INTO `estados` (`EstadoID`, `Nome_do_Estado`) VALUES
(1, 'Acre'),
(2, 'Alagoas'),
(3, 'Amapá'),
(4, 'Amazonas'),
(5, 'Bahia'),
(6, 'Ceará'),
(7, 'Distrito Federal'),
(8, 'Espírito Santo'),
(9, 'Goiás'),
(10, 'Maranhão'),
(11, 'Mato Grosso'),
(12, 'Mato Grosso do Sul'),
(13, 'Minas Gerais'),
(14, 'Pará'),
(15, 'Paraíba'),
(16, 'Paraná'),
(17, 'Pernambuco'),
(18, 'Piauí'),
(19, 'Rio de Janeiro'),
(20, 'Rio Grande do Norte'),
(21, 'Rio Grande do Sul'),
(22, 'Rondônia'),
(23, 'Roraima'),
(24, 'Santa Catarina'),
(25, 'São Paulo'),
(26, 'Sergipe'),
(27, 'Tocantins');

-- --------------------------------------------------------

--
-- Estrutura para tabela `linguagens_de_programacao`
--

DROP TABLE IF EXISTS `linguagens_de_programacao`;
CREATE TABLE `linguagens_de_programacao` (
  `LinguagemID` int(11) NOT NULL,
  `Nome_da_Linguagem` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `linguagens_de_programacao`
--

INSERT INTO `linguagens_de_programacao` (`LinguagemID`, `Nome_da_Linguagem`) VALUES
(1, 'Java'),
(2, 'Python'),
(3, 'JavaScript'),
(4, 'C#'),
(5, 'C++'),
(6, 'Ruby'),
(7, 'Swift'),
(8, 'PHP'),
(9, 'HTML/CSS'),
(10, 'SQL'),
(11, 'R'),
(12, 'Kotlin'),
(13, 'Go'),
(14, 'TypeScript'),
(15, 'Objective-C'),
(16, 'Assembly'),
(17, 'Perl'),
(18, 'Scala'),
(19, 'Rust'),
(20, 'Dart'),
(21, 'Shell Script'),
(22, 'Lua'),
(23, 'Haskell'),
(24, 'Visual Basic'),
(25, 'Delphi'),
(26, 'COBOL'),
(27, 'Fortran'),
(28, 'Ada'),
(29, 'Lisp'),
(30, 'Scheme'),
(31, 'Prolog'),
(32, 'Erlang'),
(33, 'Clojure'),
(34, 'F#'),
(35, 'Groovy'),
(36, 'D'),
(37, 'Julia'),
(38, 'PowerShell'),
(39, 'ActionScript'),
(40, 'Bash'),
(41, 'C'),
(42, 'CoffeeScript'),
(43, 'Elixir'),
(44, 'Elm'),
(45, 'Forth'),
(46, 'Haxe'),
(47, 'Io'),
(48, 'J'),
(49, 'Objective-J'),
(50, 'Julia'),
(51, 'LabVIEW'),
(52, 'Nim'),
(53, 'Objective-C++'),
(54, 'OCaml'),
(55, 'Pascal'),
(56, 'PureScript'),
(57, 'PostScript'),
(58, 'Rebol'),
(59, 'Smalltalk'),
(60, 'Tcl'),
(61, 'VHDL'),
(62, 'Verilog'),
(63, 'X10'),
(64, 'XQuery'),
(65, 'ZPL');

-- --------------------------------------------------------

--
-- Estrutura para tabela `proeficiencia`
--

DROP TABLE IF EXISTS `proeficiencia`;
CREATE TABLE `proeficiencia` (
  `ID_Proeficiencia` int(11) NOT NULL,
  `Nivel_Proeficiencia` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `proeficiencia`
--

INSERT INTO `proeficiencia` (`ID_Proeficiencia`, `Nivel_Proeficiencia`) VALUES
(1, 'A1 - Iniciante'),
(2, 'A2 - Básico'),
(3, 'B1 - Intermediário'),
(4, 'B2 - Independente'),
(5, 'C1 - Proficiência eficaz'),
(6, 'C2 - Domínio pleno');

-- --------------------------------------------------------

--
-- Estrutura para tabela `projetos`
--

DROP TABLE IF EXISTS `projetos`;
CREATE TABLE `projetos` (
  `ProjetoID` int(11) NOT NULL,
  `Nome` varchar(255) DEFAULT NULL,
  `Nome_Criador` varchar(100) NOT NULL,
  `Descricao` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `projetos`
--

INSERT INTO `projetos` (`ProjetoID`, `Nome`, `Nome_Criador`, `Descricao`) VALUES
(1, 'Projeto A', 'João Silva', 'Descrição do Projeto A'),
(2, 'Projeto B', 'Maria Souza', 'Descrição do Projeto B'),
(3, 'Projeto C', 'Pedro Santos', 'Descrição do Projeto C'),
(4, 'Projeto D', 'Ana Lima', 'Descrição do Projeto D'),
(5, 'Projeto E', 'Carlos Oliveira', 'Descrição do Projeto E');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `associacao_colaborador_linguagem`
--
ALTER TABLE `associacao_colaborador_linguagem`
  ADD PRIMARY KEY (`AssocID`),
  ADD KEY `ColaboradorID` (`ColaboradorID`),
  ADD KEY `LinguagemID` (`LinguagemID`),
  ADD KEY `fk_proeficiencia` (`ProeficienciaID`);

--
-- Índices de tabela `associacao_contribuicao_linguagem`
--
ALTER TABLE `associacao_contribuicao_linguagem`
  ADD PRIMARY KEY (`Assoc_Contrib_ID`),
  ADD KEY `ContribuicaoID` (`ContribuicaoID`),
  ADD KEY `LinguagemID` (`LinguagemID`);

--
-- Índices de tabela `cidades`
--
ALTER TABLE `cidades`
  ADD PRIMARY KEY (`CidadeID`),
  ADD KEY `EstadoID` (`EstadoID`);

--
-- Índices de tabela `colaboradores`
--
ALTER TABLE `colaboradores`
  ADD PRIMARY KEY (`ColaboradorID`),
  ADD KEY `ColaboradorID` (`ColaboradorID`),
  ADD KEY `CidadeID` (`CidadeID`);

--
-- Índices de tabela `contribuicoes_de_codigo`
--
ALTER TABLE `contribuicoes_de_codigo`
  ADD PRIMARY KEY (`ContribuicaoID`),
  ADD KEY `ProjetoID` (`ProjetoID`),
  ADD KEY `ColaboradorID` (`ColaboradorID`);

--
-- Índices de tabela `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`EstadoID`);

--
-- Índices de tabela `linguagens_de_programacao`
--
ALTER TABLE `linguagens_de_programacao`
  ADD PRIMARY KEY (`LinguagemID`),
  ADD KEY `LinguagemID` (`LinguagemID`);

--
-- Índices de tabela `proeficiencia`
--
ALTER TABLE `proeficiencia`
  ADD PRIMARY KEY (`ID_Proeficiencia`),
  ADD KEY `ID_Proeficiencia` (`ID_Proeficiencia`);

--
-- Índices de tabela `projetos`
--
ALTER TABLE `projetos`
  ADD PRIMARY KEY (`ProjetoID`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `associacao_colaborador_linguagem`
--
ALTER TABLE `associacao_colaborador_linguagem`
  MODIFY `AssocID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `associacao_contribuicao_linguagem`
--
ALTER TABLE `associacao_contribuicao_linguagem`
  MODIFY `Assoc_Contrib_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `cidades`
--
ALTER TABLE `cidades`
  MODIFY `CidadeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=142;

--
-- AUTO_INCREMENT de tabela `colaboradores`
--
ALTER TABLE `colaboradores`
  MODIFY `ColaboradorID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de tabela `contribuicoes_de_codigo`
--
ALTER TABLE `contribuicoes_de_codigo`
  MODIFY `ContribuicaoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `estados`
--
ALTER TABLE `estados`
  MODIFY `EstadoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de tabela `linguagens_de_programacao`
--
ALTER TABLE `linguagens_de_programacao`
  MODIFY `LinguagemID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT de tabela `proeficiencia`
--
ALTER TABLE `proeficiencia`
  MODIFY `ID_Proeficiencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `projetos`
--
ALTER TABLE `projetos`
  MODIFY `ProjetoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `associacao_colaborador_linguagem`
--
ALTER TABLE `associacao_colaborador_linguagem`
  ADD CONSTRAINT `associacao_colaborador_linguagem_ibfk_1` FOREIGN KEY (`ColaboradorID`) REFERENCES `colaboradores` (`ColaboradorID`),
  ADD CONSTRAINT `associacao_colaborador_linguagem_ibfk_2` FOREIGN KEY (`LinguagemID`) REFERENCES `linguagens_de_programacao` (`LinguagemID`),
  ADD CONSTRAINT `associacao_colaborador_linguagem_ibfk_3` FOREIGN KEY (`ProeficienciaID`) REFERENCES `proeficiencia` (`ID_Proeficiencia`);

--
-- Restrições para tabelas `associacao_contribuicao_linguagem`
--
ALTER TABLE `associacao_contribuicao_linguagem`
  ADD CONSTRAINT `associacao_contribuicao_linguagem_ibfk_1` FOREIGN KEY (`ContribuicaoID`) REFERENCES `contribuicoes_de_codigo` (`ContribuicaoID`),
  ADD CONSTRAINT `associacao_contribuicao_linguagem_ibfk_2` FOREIGN KEY (`LinguagemID`) REFERENCES `linguagens_de_programacao` (`LinguagemID`);

--
-- Restrições para tabelas `cidades`
--
ALTER TABLE `cidades`
  ADD CONSTRAINT `cidades_ibfk_1` FOREIGN KEY (`EstadoID`) REFERENCES `estados` (`EstadoID`);

--
-- Restrições para tabelas `colaboradores`
--
ALTER TABLE `colaboradores`
  ADD CONSTRAINT `colaboradores_ibfk_1` FOREIGN KEY (`CidadeID`) REFERENCES `cidades` (`CidadeID`);

--
-- Restrições para tabelas `contribuicoes_de_codigo`
--
ALTER TABLE `contribuicoes_de_codigo`
  ADD CONSTRAINT `contribuicoes_de_codigo_ibfk_1` FOREIGN KEY (`ProjetoID`) REFERENCES `projetos` (`ProjetoID`),
  ADD CONSTRAINT `contribuicoes_de_codigo_ibfk_2` FOREIGN KEY (`ColaboradorID`) REFERENCES `colaboradores` (`ColaboradorID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
