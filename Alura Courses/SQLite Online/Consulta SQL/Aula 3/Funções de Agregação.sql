
/* Funções de Agregação - MAX, MIN e SUM*/
SELECT mes, MAX(faturamento_bruto) FROM faturamento;/*Exibe o mes com maximo faturamento*/
SELECT mes, MIN(faturamento_bruto) FROM faturamento;/*Exibe o mes com minimo faturamento*/

SELECT SUM(numero_novos_clientes) AS 'Novos Clientes  2023' FROM faturamento
WHERE mes like '%2023'; /*Exibe a soma de clientes novos no ano de 2023*/

/* Funções de Agregação - COUNT E AVG*/
SELECT AVG(despesas) FROM faturamento; /* Pega a média da coluna despesas*/

SELECT COUNT(*) FROM HistoricoEmprego
WHERE datatermino NOT NULL; /* Conta todas as linhas da coluna datatermino, onde não tem NULL */

SELECT COUNT(*) FROM Licencas 
WHERE tipolicenca = 'férias'; /* Conta todas as linhas da coluna tipolicenca, onde é = 'férias' */