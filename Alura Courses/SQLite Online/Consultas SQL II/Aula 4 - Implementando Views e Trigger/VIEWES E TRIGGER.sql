
-- Nova consulta
-- Contexto: calcule o valor total dos pedidos, de cada cliente.

SELECT p.id, c.nome, SUM(ip.precounitario) AS ValorTotalPedido
FROM clientes c
JOIN pedidos p ON c.id = p.idcliente
JOIN itenspedidos ip ON p.id = ip.idpedido
GROUP BY p.id, c.nome

-- Explicação
-- Seleciona o ID do pedido, o nome do cliente e o valor total do pedido.
--SELECT p.id, c.nome, SUM(ip.precounitario) AS ValorTotalPedido
--FROM clientes c

-- Realiza uma junção interna entre 'clientes' e 'pedidos' usando o ID do cliente como chave.
--JOIN pedidos p ON c.id = p.idcliente

-- Realiza uma junção interna entre 'pedidos' e 'itenspedidos' usando o ID do pedido como chave.
--JOIN itenspedidos ip ON p.id = ip.idpedido

-- Agrupa os resultados pelo ID do pedido e nome do cliente para calcular o valor total do pedido.
--GROUP BY p.id, c.nome;

-- Resultado:
-- ID: Tabela pedidos.
-- NOME: Tabela clientes.
-- ValorTotalPedido: Suma do precounitario da tabela itenspedidos.
--| id  | nome      | ValorTotalPedido |
--|-----|-----------|------------------|
--| 101 | Cliente A | 80.00            |
--| 102 | Cliente B | 20.00            |
--| 103 | Cliente A | 40.00            |



-- VIEWES
-- Contexto: Encontrar domras de otimizar as funcoes.

CREATE VIEW ViewCliente AS 
SELECT * FROM clientes;

SELECT * FROM ViewCliente;


CREATE VIEW ViewTotalPedido AS 
SELECT p.id, c.nome, SUM(ip.precounitario) AS ValorTotalPedido
FROM clientes c
JOIN pedidos p ON c.id = p.idcliente
JOIN itenspedidos ip ON p.id = ip.idpedido
GROUP BY p.id, c.nome

SELECT * FROM ViewTotalPedido;



-- Criando um TRIGGER 
-- Contexto: Retornar o faturamento diario.

CREATE TRIGGER CalculaFaturamentoDiario
AFTER INSERT ON itenspedidos
FOR EACH ROW
BEGIN
DELETE FROM FaturamentoDiario
INSERT INTO FaturamentoDiario (Dia, FaturamentoTotal)
SELECT DATE(datahorapedido) AS Dia, SUM(ip.precounitario) AS FaturamentoDiario
FROM pedidos p
JOIN itenspedidos ip
ON p.id = ip.idpedido
GROUP BY Dia
ORDER BY Dia
END

-- Explicação
-- Cria um trigger chamado 'CalculaFaturamentoDiario'.
--CREATE TRIGGER CalculaFaturamentoDiario
-- Define que o trigger será executado após a inserção de um novo item na tabela 'itenspedidos'.
--AFTER INSERT ON itenspedidos
--FOR EACH ROW
--BEGIN
    -- Remove todos os registros da tabela 'FaturamentoDiario' para recalcular os valores.
    --DELETE FROM FaturamentoDiario;

    -- Insere os novos valores de faturamento diário na tabela 'FaturamentoDiario'.
    --INSERT INTO FaturamentoDiario (Dia, FaturamentoTotal)
    -- Seleciona a data do pedido e a soma dos preços unitários dos itens de pedidos.
    --SELECT DATE(p.datahorapedido) AS Dia, SUM(ip.precounitario) AS FaturamentoDiario
    -- Realiza uma junção entre 'pedidos' e 'itenspedidos' usando o ID do pedido como chave.
    --FROM pedidos p
    --JOIN itenspedidos ip ON p.id = ip.idpedido
    -- Agrupa os resultados pela data do pedido.
    --GROUP BY Dia
    -- Ordena os resultados pela data.
    --ORDER BY Dia;
--END;

