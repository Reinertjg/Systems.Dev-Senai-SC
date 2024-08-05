 
-- INNER JOIN
-- O INNER JOIN eh utilizado para realizar junções entre colunas de tabelas distintas que possuem ligacoes.

SELECT c.nome, p.id, p.datahorapedido
FROM clientes c
INNER JOIN pedidos p
on c.id = p.idcliente;

-- A consulta retornara o nome da tabela de clientes e o ID e datahorapedido da tabela de pedidos.
-- 'FROM clientes c INNER JOIN pedidos p', junta as tabelas, e apelida as duas com os alias 'c' e 'p'.
-- 'on c.id = p.idcliente;', ientifica que o ID da tabela clientes faz referencia ao idcliente da tabela pedidos.



-- RIGHT JOIN
-- Contexto: Identificar quais produtos foram vendidos ou não.

SELECT pr.nome, ip.idproduto, ip.idpedido
FROM itenspedidos ip
RIGHT JOIN produtos pr
on pr.id = ip.idproduto

-- A consulta retornara o nome da tabela de produtos e o idproduto e idpedido da tabela de itenspedidos.
-- 'FROM itenspedidos ip RIGHT JOIN produtos pr on pr.id = ip.idproduto'
-- Realiza uma junção externa direita com a tabela `produtos`.
-- Usa o alias `pr` para a tabela `produtos`.
-- Garante que todas as linhas da tabela `produtos` sejam incluídas no resultado,
-- mesmo se não houver correspondências na tabela `itenspedidos`.
-- Se não houver correspondências, as colunas da tabela `itenspedidos` serão `NULL`.

-- Exemplo: 
-- | nome      | idproduto | idpedido |
-- |-----------|-----------|----------|
-- | Produto A | 1         | 101      |
-- | Produto B | 2         | 102      |
-- | Produto C | NULL      | NULL     |



-- LEFT JOIN
-- Contexto: Identificar quais clientes não têm vendas em um determinado mês.

SELECT c.nome, x.id
FROM clientes c 
LEFT JOIN
(
    SELECT p.id, p.idcliente 
    FROM pedidos p 
    WHERE strftime('%m', p.datahorapedido) = '10')x
ON c.id = x.idcliente
WHERE x.idcliente IS NULL

-- Explicação

-- Seleciona o nome do cliente da tabela 'clientes' e o ID da subconsulta.
-- SELECT c.nome, x.id
-- FROM clientes c 

-- Realiza uma junção externa esquerda com uma subconsulta que seleciona pedidos.
--LEFT JOIN
--(
    -- Subconsulta que seleciona o ID e o ID do cliente da tabela 'pedidos'.
    -- Filtra os pedidos cuja data do pedido está no mês de outubro (mês '10').
    --SELECT p.id, p.idcliente 
    --FROM pedidos p 
    --WHERE strftime('%m', p.datahorapedido) = '10'
--) x

-- Condição de junção que associa clientes aos pedidos usando o ID do cliente.
--ON c.id = x.idcliente

-- Filtra os resultados para incluir apenas clientes que não têm pedidos no mês de outubro.
--WHERE x.idcliente IS NULL;

-- Exemplo: 
-- | nome      | ID        |
-- |-----------|-----------|
-- | Cliente A | NULL      |
-- | Cliente F | NULL      |
-- | Cliente H | NULL      |



-- FULL JOIN
-- Contexto: Clientes que não realizaram pedidos e se existem pedidos que não têm clientes associadas a eles.

SELECT c.nome, p.id 
FROM clientes c
FULL JOIN pedidos p
ON c.id = p.idcliente
WHERE c.id IS NULL;

-- Explicação

-- Seleciona o nome do cliente da tabela 'clientes' e o ID da tabela 'pedidos'.
--SELECT c.nome, p.id 
--FROM clientes c

-- Realiza uma junção externa completa (FULL JOIN) entre as tabelas 'clientes' e 'pedidos'.
-- A junção é feita usando o ID do cliente como chave.
--FULL JOIN pedidos p
--ON c.id = p.idcliente

-- Filtra os resultados para incluir apenas os registros onde o ID do cliente é NULL.
--WHERE c.id IS NULL;

-- Exemplo:
-- | nome | id  |
-- |------|-----|
-- | NULL | 17  |
-- | NULL | 40  |
-- | NULL | 74  |
-- | NULL | 100 |