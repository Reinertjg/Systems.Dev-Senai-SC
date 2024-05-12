insert into tabelaclientes
(id_cliente,
 nome_cliente,
 informacoes_de_contato,
 endereço_cliente)
 values 
 ('1', 'Amanda Silva', 'Amanda.silva@gmail.com', 'Rua Flores - Casa 1');
 /*Adiconar os valores em sequencia*/


INSERT INTO tabela_destino (coluna1, coluna2, ... )
SELECT coluna1, coluna2, ... 
FROM tabela_origem
WHERE condição;

INSERT INTO tabelapedidosgold
  (id_pedido_gold,
   data_do_pedido_gold,
   status_gold,
   total_do_pedido_gold,
   cliente_gold,
   data_de_envio_estimada_gold)
SELECT
 	id_pedido,
    data_do_pedido,
    status,
    total_do_pedido,
    cliente,
    data_de_envio_estimada
FROM tabelapedidos
WHERE total_do_pedido >= 400;
/* Passa os dados com o total_do_pedido igual ou maior que 400, para a tabela (tabelapedidosgold) */