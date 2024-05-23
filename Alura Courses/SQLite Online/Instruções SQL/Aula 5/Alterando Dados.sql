UPDATE tabela SET coluna = "Dado" WHERE coluna = "Dado_Alterado";

UPDATE tabela_pedidos SET status_pedido = "Pendente" WHERE status_pedido = "Processando";
/*  
    Altera o dado de uma coluna inteira 
    Então dados que estavam como "Pendentes" foi alterado nas colunas onde os dados 
    eram igual a = "Processando" 
*/

UPDATE tabelaclientes SET informacoes_de_contato = "j.santos@gmai.com", 
endereco_cliente = "Rua dos paralelepipedos, 30" WHERE id_cliente = 2;
/*  
    Alterado as colunas "informacoes_de_contato" e "endereco_cliente" 
    aonde o "id_cliente" é igual a = 2 
*/

