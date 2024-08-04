
-- Unindo tabelas com o UNION

-- Sintaxe: 
-- SELECT coluna1, coluna2, coluna3 FROM tabela1
-- UNION
-- SELECT coluna1, coluna2, coluna3 FROM tabela2

-- O UNION unifica duas tabelas, mas remove valores duplicados.

-- Exemplo:
SELECT rua, bairro, cidade, estado, cep FROM colaboradores
UNION
SELECT rua, bairro, cidade, estado, cep FROM fornecedores;



-- Unindo tabelas com o UNION ALL

-- Sintaxe: 
-- SELECT coluna1, coluna2, coluna3 FROM tabela1
-- UNION ALL
-- SELECT coluna1, coluna2, coluna3 FROM tabela2

-- O UNION ALL unifica duas tabelas e mantém todos os valores, incluindo duplicados.

-- Exemplo:
SELECT rua, bairro, cidade, estado, cep FROM colaboradores
UNION ALL
SELECT rua, bairro, cidade, estado, cep FROM fornecedores;



-- Execultando Subconsultas:
-- Contexto: Achar o primeiro cliente que realizou o primeiro pedido no estabelecimento.

SELECT nome, telefone 
FROM clientes 
WHERE ID = (
    SELECT idcliente 
    FROM pedidos 
    ORDER BY datahorapedido ASC);

-- Consulta Principal:
-- Seleciona nome e telefone da tabela clientes aonde o ID for igual a Subconsulata.
SELECT nome, telefone FROM clientes WHERE ID = (...);

-- Subconsulta:
-- Seleciona o idcliente da tabela pedidos e ordenara a tabela da menor a maior data.
SELECT idcliente FROM pedidos ORDER BY datahorapedido ASC;



-- Contexto: Buscar todos os clientes que realizaram pedidos no mesmo de janeiro.

SELECT nome
from clientes 
WHERE ID IN (
  SELECT idcliente 
  from pedidos 
  WHERE strftime ('%m', datahorapedido) = '01');

-- Consulta Principal:
-- Seleciona nome da tabela clientes em Subconsulata.
-- O IN é utilizado para retornar todos os operadores que estão dentro da subconsulta.
SELECT nome from clientes WHERE ID IN ...

-- Subconsulta:
-- Seleciona o idcliente da tabela pedidos onde o mes da datahorapedido é igual a '01'
-- strftime possibilita manipular datas como, %y, %m e %d.
SELECT idcliente from pedidos WHERE strftime ('%m', datahorapedido) = '01';



-- Contexto: Buscar os produtos que são mais caros que a media de todos os produtos da tabela.

SELECT nome, preco
FROM produtos
GROUP BY nome, preco
HAVING preco > (
  SELECT AVG(preco)
  FROM produtos);

-- Consulta Principal:
-- Seleciona nome e preço da tabela produtos agrupa por nome e preço, tendo preço maior que a Subconsulta
-- O HAVING trabalha com valores que ja foram agrupados, como vira na Subconsulta
SELECT nome, preco FROM produtos GROUP BY nome, preco HAVING preco > ...

-- Subconsulta:
-- Seleciona o idcliente da tabela pedidos onde o mes da datahorapedido é igual a '01'
-- strftime possibilita manipular datas como, %y, %m e %d.
SELECT idcliente from pedidos WHERE strftime ('%m', datahorapedido) = '01';

-- Uso do GROUP BY: O GROUP BY é redundante aqui, pois nome e preco já são colunas únicas para cada produto na tabela produtos.
-- No entanto, se a tabela produtos tivesse entradas duplicadas com o mesmo nome e preco, o GROUP BY poderia ter um efeito de agrupamento dessas entradas.