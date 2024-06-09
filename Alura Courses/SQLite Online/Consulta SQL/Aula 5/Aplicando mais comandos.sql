SELECT id_colaborador, CARGO, salario,
CASE
WHEN salario < 3000 THEN 'Baixo'
WHEN salario BETWEEN 3000 AND 6000 then 'Medio'
Else 'alto'
END AS categoria_salario
from HistoricoEmprego;
