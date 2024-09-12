
/* 
DETERMINE;  (DT;)  ----> SELECT

Todo DT; atualiza a variavel GLB.STATUS
Espaco  quando foi bem sucedido
******  quando foi mal sucedido

Todo DT; utiliza um profile para leitura

Para acessar um atributo da tabela lida utileza-se
tabela.atributo
Exemplo:  EX101.CDBANCOX


UM REGISTRO ESPECIFICO

DT; EVERY profile (parametro 1, parametro 2, ....)
    BREAK;
END;

Exemplo:
DT; EVERY EX10101 (GSDCDEMPRES CDBANCOX)
    BREAK;
END;
DW; GLB.STATUS = (*****)
    "Erro"
END;

SQL:
select * from ex101 (nolock)
where ex101.cdempres=1 and ex101.cdbancox=1


A PARTIR DE UM REGISTRO

DT; FROM profile (parametro 1, parametro 2, ....)
    .....
END;

Exemplo:
DT; FROM EX10101 (GSDCDEMPRES GLB.ZERO)
    DW; EX101.CDEMPRES NOT = GSDCDEMPRES
        BREAK;
    END;
    ......
END;

SQL:
select * from ex101 (nolock)
where ex101.cdempres>=1 and ex101.cdbancox>=0


Um conjunto de dados

DT; GROUP profile (parametro 1, parametro 2, ....)
            FROM/BACK (parametro 1, parametro 2, ....)

Exemplo:
DT; GROUP EX10101 (GSDCDEMPRES) FROM (GLB.ZERO)
    ...
END;

SQL:
select * from ex101 (nolock)
where ex101.cdempres=1 and ex101.cdbancox>=0