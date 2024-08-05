
-- Atualizando Dados

UPDATE produtos SET preco = 13.0 WHERE id = 31

UPDATE produtos SET descricao = 'Crossaint recheado com amêndoas.' WHERE id = 28

-- Explicalção

-- Atualiza o preço do produto na tabela 'produtos'.
--UPDATE produtos
-- Define o novo preço do produto como 13.0.
--SET preco = 13.0
-- Especifica que a atualização deve ser feita apenas no produto com ID 31.
--WHERE id = 31;

-- Atualiza a descrição do produto na tabela 'produtos'.
--UPDATE produtos
-- Define a nova descrição do produto como 'Crossaint recheado com amêndoas.'
--SET descricao = 'Crossaint recheado com amêndoas.'
-- Especifica que a atualização deve ser feita apenas no produto com ID 28.
--WHERE id = 28;



-- Excluindo Dados

DELETE FROM colaboradores WHERE id =3

DELETE FROM clientes WHERE id = 27

-- Explicação

-- Remove o registro da tabela 'colaboradores' onde o ID é 3.
--DELETE FROM colaboradores
-- Especifica que a exclusão deve ser feita apenas no registro com ID 3.
--WHERE id = 3;

-- Remove o registro da tabela 'clientes' onde o ID é 27.
--DELETE FROM clientes
-- Especifica que a exclusão deve ser feita apenas no registro com ID 27.
--WHERE id = 27;



-- Atualizando o status

UPDATE Pedidos SET Status = 'Concluído'

-- Atualiza o status de todos os registros na tabela 'Pedidos'.
--UPDATE Pedidos
-- Define o novo status de todos os pedidos como 'Concluído'.
--SET Status = 'Concluído';



-- Iniciando Transações

BEGIN TRANSACTION;

SELECT * FROM clientes 

SELECT * FROM Pedidos 

UPDATE Pedidos SET Status = 'Concluído'

-- Explicação
-- Inicia uma transação.
--BEGIN TRANSACTION;
-- Seleciona todos os registros da tabela 'clientes'.
--SELECT * FROM clientes;
-- Seleciona todos os registros da tabela 'Pedidos'.
--SELECT * FROM Pedidos;
-- Atualiza o status de todos os registros na tabela 'Pedidos' para 'Concluído'.
--UPDATE Pedidos
--SET Status = 'Concluído';
-- Confirma a transação.
--COMMIT;

-- Revertendo a informação.
-- Todos esses comandos que executamos, serão revertidos.
ROLLBACK;
