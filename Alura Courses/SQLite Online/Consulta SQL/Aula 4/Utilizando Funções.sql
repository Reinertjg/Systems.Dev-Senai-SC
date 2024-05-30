
/* Utilizando Funções String */
SELECT nome, LENGTH(cpf) qtd /* LENGTH conta qunatas caracteres tem no campo especifico*/ 
FROM Colaboradores
WHERE qtd = 11;

SELECT ('A pessoa colaboradora ' || nome || ' de cpf ' || cpf || ' possui o seguinte endereço: ' || endereco)
as Texto 
FROM Colaboradores /* Cria um texto concatenado 
Exemplo: A pessoa colaboradora Dr. Cauê da Conceição de cpf 24657139061 possui o seguinte endereço: Recanto Isadora Nunes/ MS
*/
/* UPPER ou LOWER, deixam as letras maiuscula e minuscula */ 