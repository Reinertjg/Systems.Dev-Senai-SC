programa
{
	cadeia nomeProduto[99]
	cadeia pular = "\n"
	inteiro cc = 0
	inteiro contador = 0
	
	funcao inicio()
{
		inteiro opcaoMenu = 0
		faca{
			escreva(pular +"----Menu----"
				+pular+"1 - Inserir"
				+pular+"2 - Exibir"
				+pular+"3 - Encerrar")
			escreva(pular+"Informe uma opção: ")
			leia(opcaoMenu)
			escolha(opcaoMenu){
				caso 1:
				inserir()
				pare
				caso 2:
				exibir()
				pare
				caso 3:
				encerrar()
				pare
				caso contrario:
				escreva("Opção Invalida, Digite outra opção.")
				pare	
		}
		}enquanto(cc != 1)
	}
	funcao inserir(){
		faca {
			escreva(pular+"Nome do produto:")
	    		leia(nomeProduto[contador])
	    		se(nomeProduto[contador] == ""){
				escreva("Nenhum dado foi inserido."+pular)
			} senao{
		       		escreva("Dado foi inserido com sucesso."+pular)
            	}
          
        	}enquanto (nomeProduto[contador] == "")
		contador++
	}
	funcao exibir(){
		 escreva("-----------------"
		 	+pular+"Dados Inseridos:")
		 	
		para(inteiro ii = 0;  ii < contador; ii++ ){
		    escreva(pular+nomeProduto[ii])
		}
		escreva(pular+"-----------------"+pular)
	}
	funcao encerrar(){
		escreva("-------------------"
			+pular+"Programa Encerrado"
			+pular+"-------------------")
		cc = 1
	}

}
