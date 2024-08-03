
-- Unindo tabelas com o UNION

-- Sintaxe: 
-- SELECT coluna1, coluna2, coluna3 FROM tabela1
-- UNION
-- SELECT coluna1, coluna2, coluna3 FROM tabela2

-- O UNION unifica duas tabelas, mas remove valores duplicados.

-- Exemplo:
SELECT rua, bairro, cidade, estado, cep FROM colaboradores
UNION
SELECT rua, bairro, cidade, estado, cep FROM fornecedores;


-- Unindo tabelas com o UNION ALL

-- Sintaxe: 
-- SELECT coluna1, coluna2, coluna3 FROM tabela1
-- UNION ALL
-- SELECT coluna1, coluna2, coluna3 FROM tabela2

-- O UNION ALL unifica duas tabelas e mantém todos os valores, incluindo duplicados.

-- Exemplo:
SELECT rua, bairro, cidade, estado, cep FROM colaboradores
UNION ALL
SELECT rua, bairro, cidade, estado, cep FROM fornecedores;
