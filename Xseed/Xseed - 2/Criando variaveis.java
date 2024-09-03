
/* Criando variaveis Xseed

SD; nome ED; x LE; x [DE; x] (valor inicial)

ED; Edicao
    N - Numerico
    A - Alfa
    --Numerico com Sinal

LE; Lenght - Tamanho 
DE; Decimais - Opcional, somente se tiver 
()  Valor inicial. Geralmente (0) ou ()

*/

// JAVA                         Xseed

int SDCDCLIENT = 0;     // SD; SDCDCLIENT     ED;  N   LE; 6  (0)
                        // SD; SDCDCLIENT     ED;  N   LE; 3  (0)

double SDVLDUPLIC = 0;  // SD; SDVLDUPLIC     ED;  N   LE; 12   DE; 2  (0)
                        // SD; SDVLDUPLIC     ED;  -   LE; 12   DE; 2  (0)

String SDNMCLIENT = ""; // SD; SDNMCLIENT     ED;  A   LE; 30  (0)

/* Variaveis de grupo:
SD; nome_grupo GROUP;
    SD; nome_elementar   ED; x LE; x [DE; x] (valor inicial)
    SD; nome_elementar   ED; x LE; x [DE; x] (valor inicial)
    SD; nome_elementar   ED; x LE; x [DE; x] (valor inicial)
END.GROUP;
*/

// Exemplo

/*
SD: GRNRCEPBAS      GROUP;
    SD; GENRCEPLOC          ED; N   LE;   5  (0)
    SD; GENRCEPCOM          ED; N   LE;   3  (3)
END.GROUP;

MV;  (89110902)            GRNRCEPBAS

GRNRCEBAS → 89110902
GENRCEPLOC → 89110
GENRCEPCOM → 902


MV; (620)                 GRNRCEBAS

GENRCEPCOM → 89110620







0 G
ED;
N


LE; 6 (0)


ED;
N


LE; 3 (0)


ED; N


LE; 12






1C: 12



DE; 2 (0)
DE: 2 0
Editar e crim
(0)
(3)