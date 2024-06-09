
/* EXpressao CASE */
/* A expressao CASE cria condições para a consulta */
SELECT id_colaborador, CARGO, salario,
CASE
WHEN salario < 3000 THEN 'Baixo'
WHEN salario BETWEEN 3000 AND 6000 THEN 'Medio'
Else 'alto'
END AS categoria_salario
from HistoricoEmprego;
