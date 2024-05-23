/*
Você trabalha como um administrador de banco de dados em uma empresa de recursos humanos. A empresa precisa armazenar
informações sobre novos funcionários em seu banco de dados. Sua tarefa é criar uma instrução SQL INSERT para inserir
os detalhes de um novo funcionário em uma tabela de funcionários.

A tabela de funcionários possui os seguintes campos:

ID (Chave Primária)
Nome (Texto)
Cargo (Texto)
Departamento (Texto)
Data de Contratação (Data)
Salário (Decimal)
Escreva uma instrução SQL INSERT para adicionar um novo funcionário à tabela. Use os seguintes dados de exemplo:

ID: 32D
Nome: João Silva
Cargo: Desenvolvedor de Software
Departamento: TI
Data de Contratação: 2023-10-24
Salário: 6000.00
*/

CREATE TABLE tabelaFuncionario (
    id_funcionario INT PRIMARY KEY,
    nome_funcionario VARCHAR(250),
    cargo_funcionario  VARCHAR(250),
    departamento_funcionario  VARCHAR(250),
    data_de_contratacao DATE,
    salario_funcionario Decimal(10, 2)
);

INSERT INTO tabelaFuncionario (
    id_funcionario,
    nome_funcionario,
    cargo_funcionario,
    departamento_funcionario,
    data_de_contratacao,
    salario_funcionario
 ) VALUES 
 ('32D', 'John Silva', 'Desenvolvedor de Software', 'TI', '2023-10-24', 6000.00);