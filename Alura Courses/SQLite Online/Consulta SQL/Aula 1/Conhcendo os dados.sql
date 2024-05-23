SELECT * FROM HistoricoEmprego
ORDER BY salario DESC
LIMIT 5;

SELECT * FROM HistoricoEmprego 
WHERE datatermino IS NULL
ORDER BY salario DESC
limit 5;

SELECT * FROM HistoricoEmprego 
WHERE datatermino NOT NULL
ORDER BY salario DESC
limit 5;
