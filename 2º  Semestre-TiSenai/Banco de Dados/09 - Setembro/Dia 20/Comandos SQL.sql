Create Table
CREATE TABLE Clientes (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE,
    DataNascimento DATE,
    Telefone VARCHAR(20)
);


Alter Table
ALTER TABLE nome_da_tabela
ADD nome_da_coluna tipo_de_dado;
Exemplo:
ALTER TABLE clientes
ADD data_nascimento DATE;


Drop Table
DROP TABLE nome_da_tabela;
Exemplo:
DROP TABLE clientes;


Insert
INSERT INTO nome_da_tabela (coluna1, coluna2, coluna3, ...)
VALUES (valor1, valor2, valor3, ...);
Exemplo:
INSERT INTO produtos (codigo, nome, preco)
VALUES (101, 'Camiseta', 19.99);


Update
UPDATE nome_da_tabela
SET coluna1 = novo_valor1, coluna2 = novo_valor2, ...
WHERE condição;
Exemplo:
UPDATE funcionarios
SET salario = salario * 1.1
WHERE departamento = 'Vendas';


Delete
DELETE FROM nome_da_tabela
WHERE condição;
Exemplo:
DELETE FROM clientes
WHERE id = 123;


Where
SELECT * FROM produtos
WHERE preco > 50;


SELECT * FROM produtos
WHERE nome = 'Camiseta';


Group By
SELECT produto, SUM(valor) as total_vendas
FROM vendas
GROUP BY produto;


Order By
SELECT nome, salario
FROM funcionarios
ORDER BY salario DESC;


AND: avalia se duas condições são verdadeiras
OR: avalia se uma condição é verdadeira
NOT: negação

< Menor
> Maior
<= Menor ou igual
>= Maior ou igual
= Igual
<> Diferente
