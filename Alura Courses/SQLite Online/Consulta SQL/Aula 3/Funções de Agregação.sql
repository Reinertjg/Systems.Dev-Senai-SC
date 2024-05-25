
/* Funções de Agregação - MAX, MIN e SUM*/
SELECT mes, MAX(faturamento_bruto) FROM faturamento;/*Exibe o mes com maximo faturamento*/
SELECT mes, MIN(faturamento_bruto) FROM faturamento;/*Exibe o mes com minimo faturamento*/

SELECT SUM(numero_novos_clientes) AS 'Novos Clientes  2023' FROM faturamento
WHERE mes like '%2023';/*Exibe a soma de clientes novos no ano de 2023*/