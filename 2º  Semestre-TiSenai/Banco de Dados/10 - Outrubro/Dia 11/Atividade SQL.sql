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



