__Cláusula WHERE:__ A maioria dos filtros é especificada na cláusula WHERE de uma consulta SELECT. 
Por exemplo, a consulta a seguir retorna todos os clientes com idade superior a 30 anos:   
    `SELECT * FROM Clientes WHERE Idade > 30;`


__Operadores Lógicos:__ Você pode combinar várias condições usando operadores lógicos, como AND, OR e NOT.
Isso permite criar filtros complexos. Por exemplo, recuperar clientes com idade superior a 30 e que não sejam do sexo masculino:    
    `SELECT * FROM Clientes WHERE Idade > 30 AND Sexo <> 'Masculino';`


__Filtros de Texto:__ Para strings, você pode usar operadores de comparação ou funções como LIKE para filtrar registros com base em padrões de texto. 
Por exemplo, recuperar produtos que contenham a palavra "computador" no nome:    
    `SELECT * FROM Produtos WHERE Nome LIKE 'computador';`


__Filtros de Data:__ Para datas, você pode usar operadores como =, >, <, etc., para filtrar registros com base em datas.
Por exemplo, recuperar pedidos feitos após uma data específica:    
    `SELECT * FROM Pedidos WHERE DataPedido > '2023-01-01';`
