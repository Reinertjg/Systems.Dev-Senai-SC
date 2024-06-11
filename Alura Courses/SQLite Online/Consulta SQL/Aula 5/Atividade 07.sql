/* Atividades */

/* 1 - Selecione os primeiros 5 registros da tabela clientes, ordenando-os pelo nome em ordem crescente. */
SELECT * FROM clientes 
ORDER BY nome ASC LIMIT 5;

/* 2 - Encontre todos os produtos na tabela produtos que não têm uma descrição associada (suponha que a coluna de descrição possa ser nula). */
SELECT * FROM produtos WHERE descricao IS NULL;

/* 3 - Liste os funcionários cujo nome começa com 'A' e termina com 's' na tabela funcionarios. */
SELECT * FROM funcionarios WHERE nome LIKE 'A%' AND nome LIKE '%s';

/* 4 - Exiba o departamento e a média salarial dos funcionários em cada departamento na tabela funcionarios, agrupando por departamento, apenas para os departamentos cuja média salarial é superior a $5000. */
SELECT departamento, AVG(salario) AS media_salarial
FROM funcionarios
GROUP BY departamento
HAVING AVG(salario) > 5000;

/* 5 - Selecione todos os clientes da tabela clientes e concatene o primeiro e o último nome, além de calcular o comprimento total do nome completo. */
SELECT nome || ' ' || sobrenome AS nome_completo, LENGTH(nome || ' ' || sobrenome) AS comprimento_nome
FROM clientes;

/* 6 - Para cada venda na tabela vendas, exiba o ID da venda, a data da venda e a diferença em dias entre a data da venda e a data atual. */
SELECT id, data_venda, julianday('now') - julianday(data_venda) AS diferenca_dias
FROM vendas;

/* 7 - Selecione todos os itens da tabela pedidos e arredonde o preço total para o número inteiro mais próximo. */
SELECT id, ROUND(preco_total) AS preco_arredondado
FROM pedidos;

/* 8 - Converta a coluna data_string da tabela eventos, que está em formato de texto (YYYY-MM-DD), para o tipo de data e selecione todos os eventos após '2023-01-01'.*/
SELECT *
FROM eventos
WHERE CAST(data_string AS DATE) > '2023-01-01';

/* 9 - Na tabela avaliacoes, classifique cada avaliação como 'Boa', 'Média', ou 'Ruim' com base na pontuação: 1-3 para 'Ruim', 4-7 para 'Média', e 8-10 para 'Boa'. */
SELECT id,
  CASE 
    WHEN pontuacao BETWEEN 1 AND 3 THEN 'Ruim'
    WHEN pontuacao BETWEEN 4 AND 7 THEN 'Média'
    ELSE 'Boa'
  END AS classificacao
FROM avaliacoes;

/* 10 - Altere o nome da coluna data_nasc para data_nascimento na tabela funcionarios e selecione todos os funcionários que nasceram após '1990-01-01'. */
-- Renomeando a coluna
ALTER TABLE funcionarios RENAME COLUMN data_nasc TO data_nascimento;

-- Selecionando funcionários
SELECT * FROM funcionarios WHERE CAST(data_nascimento AS DATE) > '1990-01-01';
