DELETE FROM tabela WHERE coluna = "Dado";

DELETE FROM tabelafornecedores WHERE pais_de_origem = "Turquia";
/*
    Deletado todos os fornecedores com a coluna "pais_de_origem" = "turquia"
*/

DELETE FROM tabelafornecedores WHERE id_fornecedor > 35;
/*
    Deletado todos os fornecedores com a id_fornecedor maior que 35
*/