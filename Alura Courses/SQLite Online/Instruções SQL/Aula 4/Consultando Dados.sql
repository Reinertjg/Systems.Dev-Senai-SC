
/* Consultas */
SELECT * FROM tabelapedidos WHERE total_do_pedido > 200;
SELECT * FROM tabelapedidos WHERE total_do_pedido < 200;
SELECT * FROM tabelapedidos WHERE total_do_pedido >= 200;
SELECT * FROM tabelapedidos WHERE total_do_pedido <= 200;
SELECT * FROM tabelapedidos WHERE total_do_pedido <> 200;
SELECT * FROM tabelapedidos WHERE total_do_pedido = 200;
SELECT * FROM tabelaclientes WHERE nome_cliente > 'C';
SELECT * FROM tabelapedidos WHERE data_do_pedido > '2023-09-19';

SELECT * FROM tabelapedidos WHERE total_do_pedido >= 200 AND Status = 'Pendente';
SELECT * FROM tabelapedidos WHERE status = 'Pendente' OR status = 'Processando';
SELECT * FROM tabelapedidos WHERE NOT status = 'Pendente';

SELECT * FROM tabelapedidos WHERE data_de_envio_estimada BETWEEN '2023-08-01' AND '2023-09-01';
SELECT * FROM tabelaprodutos WHERE preco_de_compra BETWEEN 200 and 600;
/* BETWEEN = entre algo  */


SELECT * FROM tabelaprodutos WHERE preco_de_compra BETWEEN 200 AND 600 ORDER BY nome_do_produto;
SELECT * FROM tabelaprodutos WHERE preco_de_compra BETWEEN 200 AND 600 ORDER BY data_de_inclusao;
SELECT * FROM tabelaprodutos WHERE preco_de_compra BETWEEN 200 AND 600 ORDER BY fornecedor;
/* ORDER BY = Ordernar por*/
SELECT * FROM tabelaprodutos WHERE preco_de_compra BETWEEN 200 AND 600 ORDER BY fornecedor DESC;
/* DESC = Decrescente*/

SELECT informacoes_de_contato AS email_cliente FROM clientes;
/*  Quando quiser criar um apilido de alguma coluna na consulta */


