
/* Utilizando Funções String */
SELECT nome, LENGTH(cpf) qtd /* LENGTH conta qunatas caracteres tem no campo especifico*/ 
FROM Colaboradores
WHERE qtd = 11;

SELECT ('A pessoa colaboradora ' || nome || ' de cpf ' || cpf || ' possui o seguinte endereço: ' || endereco)
as Texto 
FROM Colaboradores /* Cria um texto concatenado 
Exemplo: A pessoa colaboradora Dr. Cauê da Conceição de cpf 24657139061 possui o seguinte endereço: Recanto Isadora Nunes/ MS */
/* UPPER ou LOWER, deixam as letras maiuscula e minuscula */ 


/* Utilizando Funções Data */
/* Consulta somente o Ano e o Mes da coluna datainicio */
SELECT ID_colaborador, STRFTIME('%Y/%M', datainicio) FROM Licencas;

/* Colsunta o intervalo de tempo entre duas colunas de tipo Data */
SELECT ID_colaborador, JULIANDAY (datatermino) - JULIANDAY (datacontratacao)
FROM HistoriocoEmprego
WHERE datatermino IS NOT NULL;


/* Utilizando Funções Numéricas */
/* A espressão ROUND arredonda uma quantidade de casas especifica após a virgula, neste caso determinamos 2 casas após a virgula */
SELECT AVG(faturamento_bruto), ROUND (AVG(faturamento_bruto)),2) FROM faturamento;

/* A expressão CEIL arrebonda o valor numero para um interio maior, ja a expressão FLOOR arrendonda para um inteiro menor */
SELECT CEIL(faturamento_bruto),  FLOOR(despesas) FROM faturamento;


/* Utilizando Funções de Conversão */
SELECT (' O faturamento bruto médio foi ' || CAST(ROUND (AVG(faturamento_bruto),2) AS TEXT)) AS "Media Faturamento Bruto"
FROM faturamento;
/*  
    "CAST"  Converte um valor numero em string
    "ROUND" Arredonda uma quantidade de casas especifica após a virgula 
    "AVG"   Cria a media da coluna
*/

