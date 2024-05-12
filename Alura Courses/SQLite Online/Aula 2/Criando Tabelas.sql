CREATE TABLE tabelaclientes (
  	ID_Cliente INT PRIMARY KEY, /* Nome da coluna, Tipo de dado */
  	Nome_Cliente VARCHAR (250),
	  Informacoes_de_Contato VARCHAR(250)
	);
/*Cria uma tabela*/

DROP tipo_do_objeto nome_do_objeto;
DROP TABLE tabelaclientes;
DROP DATABASE Colegio_São_Paulo;
DROP SCHEMA Turno_da_manhã;
/*Exclui uma tabela*/

ALTER TABLE nome_da_tabela Add nome_da_coluna tipo_de_dado;
ALTER TABLE tabelaclientes Add Endereço_Cliente VARCHAR(255);
ALTER TABLE estudantes Add idade INT;
/*Adiciona uma coluna "Endereço_Cliente", Tipo de dado: VARCHAR, na tabela "tabelaclientes"*/

CREATE TABLE tabelaprodutos (
  ID_Produto INT PRIMARY KEY,
  Nome_do_Produto VARCHAR (250),
  Descrição TEXT,
  Categoria INT,
  Preco_de_Compra DECIMAL (10,2),
  Unidade Varchar (50),
  Fornecedor INT,
  Data_de_Inclusao DATE,
  FOREIGN KEY (Categoria) REFERENCES tabelacategorias (id_categoria),/*Chaves Estrangeiras*/
  FOREIGN KEY (Fornecedor) REFERENCES tabelafornecedores (id) /*Chaves Estrangeiras*/
  );
