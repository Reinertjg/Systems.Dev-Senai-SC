use escola;

CREATE TABLE Alunos(
ID INT auto_increment primary key,
Nome varchar(120) not null,
DataNascimento DATE,
Genero CHAR,
Endereco VARCHAR(255),
Contato VARCHAR(255)
);

select * from Alunos;

CREATE TABLE Professores(
ID INT auto_increment primary key,
Nome varchar(120) not null,
DataNascimento DATE,
Genero CHAR,
Endereco VARCHAR(255),
Contato VARCHAR(255)
);

select * from Professores;

CREATE TABLE Disciplinas(
IDDisciplina int auto_increment primary key,
NomeDisciplina varchar(255) not null
);

CREATE TABLE Turmas(
IDTurma int auto_increment primary key,
nomeTurma varchar(255) not null,
AnoLetivo int,
ProfessorResponsavel int,
foreign key (ProfessorResponsavel) references Professores(ID)
);

CREATE TABLE Notas(
IDNota int auto_increment primary key,
IDAluno int,
IDDisciplina int,
Nota decimal(5, 2),
foreign key (IDAluno) references Alunos (ID),
foreign key (IDDisciplina) references Disciplinas (IDDisciplina)
);

CREATE TABLE Frequencia(
IDFrequencia int auto_increment primary key,
IDAluno int,
IDDisciplina int,
Dia date,
Presenca boolean,
foreign key (IDAluno) references Alunos (ID),
foreign key (IDDisciplina) references Disciplinas (IDDisciplina)
);

CREATE TABLE EventosEscolares(
IDEvento int auto_increment primary key,
NomeEvento varchar(255) not null,
DataEvento date,
Descricao text,
Endereco varchar(255)
);

CREATE TABLE Usuarios(
IDUsuario int auto_increment primary key,
NomeUsuario varchar(50) not null,
Senha varchar(255)not null
);

INSERT INTO Alunos (Nome, DataNascimento, Genero, Endereco, Contato)
VALUES
  ('Lucas Lima', '2005-03-25', 'M', 'Rua C, 789', 'lucas@email.com'),
  ('Mariana Fernandes', '2004-07-14', 'F', 'Avenida Z, 456', 'mariana@email.com'),
  ('Paulo Martins', '2003-01-30', 'M', 'Rua D, 123', 'paulo@email.com'),
  ('Camila Almeida', '2002-09-10', 'F', 'Avenida W, 789', 'camila@email.com'),
  ('Marcos Pereira', '2005-05-12', 'M', 'Rua E, 456', 'marcos@email.com'),
  ('Luisa Santos', '2004-11-20', 'F', 'Avenida V, 123', 'luisa@email.com'),
  ('Fernando Oliveira', '2003-04-02', 'M', 'Rua F, 789', 'fernando@email.com'),
  ('Juliana Souza', '2002-08-15', 'F', 'Avenida U, 456', 'juliana@email.com'),
  ('Gabriel Silva', '2004-10-09', 'M', 'Rua G, 123', 'gabriel@email.com'),
  ('Isabela Rodrigues', '2003-06-18', 'F', 'Avenida T, 789', 'isabela@email.com'),
  ('Rafael Santos', '2005-02-03', 'M', 'Rua H, 456', 'rafael@email.com'),
  ('Patricia Lima', '2004-09-23', 'F', 'Avenida S, 123', 'patricia@email.com'),
  ('Leonardo Almeida', '2003-07-29', 'M', 'Rua I, 789', 'leonardo@email.com'),
  ('Cristina Fernandes', '2002-12-10', 'F', 'Avenida R, 456', 'cristina@email.com'),
  ('Sergio Pereira', '2005-06-28', 'M', 'Rua J, 123', 'sergio@email.com'),
  ('Amanda Souza', '2004-10-15', 'F', 'Avenida Q, 789', 'amanda@email.com'),
  ('Carlos Oliveira', '2003-03-05', 'M', 'Rua K, 456', 'carlos@email.com'),
  ('Eduarda Martins', '2002-07-19', 'F', 'Avenida P, 123', 'eduarda@email.com'),
  ('Marcelo Silva', '2004-01-12', 'M', 'Rua L, 789', 'marcelo@email.com'),
  ('Sofia Santos', '2003-09-14', 'F', 'Avenida O, 456', 'sofia@email.com');

select * from alunos;

INSERT INTO Professores (Nome, DataNascimento, Genero, Endereco, Contato)
VALUES
  ('Ana Oliveira', '1985-03-10', 'F', 'Avenida X, 789', 'ana@email.com'),
  ('Carlos Santos', '1978-11-25', 'M', 'Avenida Y, 101', 'carlos@email.com'),
  ('Maria Silva', '1990-07-15', 'F', 'Rua Z, 123', 'maria@email.com'),
  ('José Pereira', '1982-04-30', 'M', 'Rua W, 456', 'jose@email.com'),
  ('Fernanda Almeida', '1988-09-20', 'F', 'Avenida V, 789', 'fernanda@email.com'),
  ('Ricardo Souza', '1975-06-12', 'M', 'Avenida U, 101', 'ricardo@email.com'),
  ('Isabel Martins', '1993-02-03', 'F', 'Rua A, 789', 'isabel@email.com'),
  ('Luiz Santos', '1980-11-09', 'M', 'Avenida T, 456', 'luiz@email.com'),
  ('Patrícia Oliveira', '1987-05-28', 'F', 'Rua B, 123', 'patricia@email.com'),
  ('Paulo Alves', '1979-10-15', 'M', 'Avenida S, 789', 'paulo@email.com');

select * from professores;

INSERT INTO Disciplinas (NomeDisciplina)
VALUES
  ('Matemática'),
  ('Português'),
  ('Ciências'),
  ('História'),
  ('Geografia'),
  ('Inglês'),
  ('Física'),
  ('Química');

       
select * from disciplinas;

INSERT INTO Turmas (nomeTurma, AnoLetivo, ProfessorResponsavel)
VALUES ('Turma A', 2023, 1),  -- Professor com ID 1
       ('Turma B', 2023, 2),  -- Professor com ID 2
       ('Turma C', 2023, 3),  -- Professor com ID 3
       ('Turma D', 2023, 4);  -- Professor com ID 4

select * from turmas;

INSERT INTO Notas (IDAluno, IDDisciplina, Nota)
VALUES 	(1, 1, 8.5),  -- Nota do Aluno 1 na Disciplina 1
       	(2, 1, 7.8),  -- Nota do Aluno 2 na Disciplina 1
	(3, 2, 8.0),  -- Nota do Aluno 3 na Disciplina 2
	(4, 1, 7.5),  -- Nota do Aluno 4 na Disciplina 1
       	(4, 2, 8.8),  -- Nota do Aluno 4 na Disciplina 2
       	(5, 1, 9.3),  -- Nota do Aluno 5 na Disciplina 1
       	(5, 2, 7.1),  -- Nota do Aluno 5 na Disciplina 2
       	(6, 3, 6.5),  -- Nota do Aluno 6 na Disciplina 3
       	(1, 2, 9.2),  -- Nota do Aluno 1 na Disciplina 2
       	(2, 2, 8.5),  -- Nota do Aluno 2 na Disciplina 2
       	(3, 1, 7.0);  -- Nota do Aluno 3 na Disciplina 1

select * from Notas;

INSERT INTO Frequencia (IDAluno, IDDisciplina, Dia, Presenca)
VALUES
  (3, 1, '2023-10-18', 1),  -- Aluno 3 presente na Disciplina 1
  (4, 1, '2023-10-18', 1),  -- Aluno 4 presente na Disciplina 1
  (5, 1, '2023-10-18', 1),  -- Aluno 5 presente na Disciplina 1
  (6, 1, '2023-10-18', 0),  -- Aluno 6 ausente na Disciplina 1
  (7, 1, '2023-10-18', 1),  -- Aluno 7 presente na Disciplina 1
  (8, 1, '2023-10-18', 0),  -- Aluno 8 ausente na Disciplina 1
  (9, 1, '2023-10-18', 1),  -- Aluno 9 presente na Disciplina 1
  (10, 1, '2023-10-18', 1), -- Aluno 10 presente na Disciplina 1
  (11, 1, '2023-10-18', 1), -- Aluno 11 presente na Disciplina 1
  (12, 1, '2023-10-18', 0); -- Aluno 12 ausente na Disciplina 1
  
select * from frequencia;


