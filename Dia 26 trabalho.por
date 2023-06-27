programa
{
	inclua biblioteca Tipos --> t
	const cadeia banco_login = "adm", banco_senha = "adm"
	cadeia nomeProduto[99]
	cadeia pular = "\n"
    	inteiro cc = 0, contador = 0
    	
    	
	funcao inicio()
	{
		inteiro opcaoMenu = 0
		logico resultado = falso
		resultado  = Login()
		
		se (resultado){
			escreva("\nDeu certo")
		} senao {
			escreva("\n Deu errado")
		}
		
		faca{
		  ImprimirMenu()
		  leia(opcaoMenu)
		  escolha (opcaoMenu) {
	      	caso 1:
		          Inserir()
				pare
      		caso 2:
		          Atualizar()
	          	pare
      		caso 3:
		          Excluir()
	          	pare
	      	caso 4:
		          Exibir()
	          	pare
      		caso 9:
	          	Encerrar()
          		pare
	      	caso contrario:
		          escreva("Opção inválida. Digite novamente.")
	          	pare
		  }
		} enquanto (opcaoMenu != 9)
	}
	
	funcao logico Login(){
		
		cadeia login, senha
		logico resultado = falso

		escreva("Informe o login: ")
		leia(login)
		
		escreva("\n")

		escreva("Informe a senha: ")
		leia(senha)

		se (banco_login == login e banco_senha == senha){
			resultado = verdadeiro
		}

		retorne resultado
	}
	
	funcao ImprimirMenu(){

		inteiro opcaoMenu = 0
		
		escreva(+ pular + pular + "-----MENU-----"
		          + pular + "1 - inserir"
		          + pular + "2 - Atualizar"
		          + pular + "3 - Excluir"
		          + pular + "4 - Exibir"
		          + pular + "9 - Encerrar" + pular)
	}
	
	funcao Inserir(){
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
	
	funcao Atualizar(){
		inteiro atualizacaoIndice = 0
        	escreva("Informe o numero do vetor que deseja atualizar!" + pular)
        	leia(atualizacaoIndice)

        	se (nomeProduto[atualizacaoIndice] == "") {
            	escreva("Esse produto não existe!" + pular)
  	 	}senao{
            	escreva("Informe o novo nome do produto!" + pular)
           	leia(nomeProduto[atualizacaoIndice])
        }
		
	}
	
	funcao Excluir(){
		inteiro indice = 0
        	faca{
        		escreva("Informe o numero do produto que deseja excluir!" + pular)
        		leia(indice)
        	} enquanto(indice >= contador)
        	
  		escreva("Produto excluido com sucesso!" + pular)
      	nomeProduto[indice] = ""
        }
	
	funcao Exibir(){
	 	escreva("-----------------"
		 	+pular+"Dados Inseridos:")
		 	
		para(inteiro ii = 0;  ii < contador; ii++ ){
		    escreva(pular+nomeProduto[ii])
		}
		escreva(pular+"-----------------"+pular)
	}
	
	funcao Encerrar(){
		escreva("PROGRAMA ENCERRADO"+pular)
	}

	}
