**Cláusula LIMIT**
A cláusula LIMIT é amplamente utilizada em SGBDs como MySQL, PostgreSQL e SQLite. Sua principal função é restringir o número de registros retornados por uma consulta. Isso é particularmente útil em grandes conjuntos de dados, onde retornar todos os registros pode ser ineficiente ou desnecessário.

Sintaxe Básica:   
`SELECT colunas FROM tabela`   
`LIMIT número;`   

Exemplo Prático:     
`SELECT * FROM clientes`   
`LIMIT 10;`
