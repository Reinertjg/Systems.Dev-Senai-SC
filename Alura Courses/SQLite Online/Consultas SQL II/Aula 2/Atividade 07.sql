
-- Tabela "Alunos":
-- ID_aluno (chave primária)
-- Nome
-- Curso

-- Tabela "Notas":
-- ID_nota (chave primária)
-- ID_aluno (chave estrangeira)
-- Nota

-- Seu desafio é criar uma consulta SQL que retorne o nome do aluno que obteve a maior nota em sua disciplina.


-- O primeiro passo foi encontrar a maior nota registrada.
  SELECT MAX(Nota)
        FROM Notas

-- Em seguida, encontrar o ID do aluno que obteve essa nota máxima.
   SELECT ID_aluno
    FROM Notas
    WHERE Nota = (
        SELECT MAX(Nota)
        FROM Notas
    )

-- Por fim, retorne o nome do aluno que obteve a maior nota.
SELECT Nome
FROM Alunos
WHERE ID_aluno = (
    SELECT ID_aluno
    FROM Notas
    WHERE Nota = (
        SELECT MAX(Nota)
        FROM Notas
    )
);


-- De outra forma: 
SELECT nome
FROM alunos
WHERE ID_aluno = (
  SELECT ID_aluno
  from Notas
  ORDER BY nota DESC);