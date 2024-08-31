
/* Expressao CASE */
/* A expressao CASE cria condições para a consulta, junto criando uma nova coluna */
SELECT id_colaborador, cargo, salario,
    CASE
        WHEN salario < 3000 THEN 'Baixo'
        WHEN salario BETWEEN 3000 AND 6000 THEN 'Medio'
        Else 'alto'
    END AS categoria_salario
from HistoricoEmprego;


/* Expressao Rename */
/* Altera o nome da tabela */
ALTER TABLE HistoricoEmprego RENAME TO CargosColaboradores;
