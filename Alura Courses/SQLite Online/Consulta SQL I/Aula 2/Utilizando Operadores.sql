
/* Utilizando o LIKE */
/* Para realizar perquisa com uma parte da caracter */
SELECT * FROM Treinamento
WHERE curso LIKE '%realizar%';

SELECT * FROM Treinamento
WHERE curso LIKE 'O poder%';

SELECT * FROM Colaboradores
WHERE nome LIKE 'Gustavo%';


/* Utilizando AND, OR, IN E NOT */
SELECT * FROM HistoricoEmprego
WHERE cargo = 'Professor' AND
datatermino NOTNULL;

SELECT * FROM HistoricoEmprego
WHERE cargo = 'Oftalmologista' OR 
cargo = 'Dermatologista';

SELECT * FROM HistoricoEmprego
WHERE cargo IN ('Oftalmologista', 'Dermatologista', 'Professor');

SELECT * FROM HistoricoEmprego
WHERE cargo NOT IN ('Oftalmologista', 'Dermatologista', 'Professor');


/* Utilizando diversos operadores */
SELECT * FROM Treinamento
WHERE (curso like 'O Direito%' AND instituicao = 'da Rocha')
OR (curso LIKE 'O conforto%' AND instituicao = 'das Neves');