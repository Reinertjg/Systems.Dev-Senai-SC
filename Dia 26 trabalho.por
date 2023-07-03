programa
{
	// - variáveis globais
	inclua biblioteca Tipos --> t
	const cadeia banco_login = "adm", banco_senha = "adm"
	cadeia nomeProduto[999]
	cadeia classificacaoProduto[999]
	real estoqueProduto[999]
	cadeia pular = "\n"
    	inteiro contador = 0
    	
    	
	funcao inicio()
	{
		logico resultado = falso
		resultado = Login()
		
		se (resultado){
			escreva(pular + "Login efetuado com sucesso")
			Menu()
		} senao {
			escreva(pular + "Login/Senha inválidos")
			Encerrar()
		}
	}
	
	funcao logico Login(){
		
		cadeia login, senha
		logico resultado = falso

		escreva("Informe o login: ")
		leia(login)
		
		escreva(pular)

		escreva("Informe a senha: ")
		leia(senha)

		se (banco_login == login e banco_senha == senha){
			resultado = verdadeiro
		}

		retorne resultado
	}

	funcao Menu(){
		inteiro opcaoMenu = 0
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
				          Exibir("")
			          	pare
					caso 5:
			          	ExibirProdutoPorOrdem()
			          	pare
		          	caso 7:
		          		AdicionarEstoque()
		          		pare
	          		caso 8:
		          		RemoverEstoque()
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
	
	funcao ImprimirMenu(){
		
		escreva( pular + "***** MENU ******"			 + pular
		          + "1 - Inserir produto"				 + pular
		          + "2 - Atualizar produto"			 + pular
		          + "3 - Excluir produto"				 + pular
		          + "4 - Exibir todos os produtos"		 + pular
		          + "5 - Exibir Produto por Ordem"		 + pular
		          + "6 - Exibir Produto por Classificação" + pular
		          + "7 - Adicionar Estoque"			 + pular
		          + "8 - Remover Estoque"				 + pular
		          + "9 - Encerrar"					 + pular)
	}
	
	funcao Inserir(){
		
		faca {
			escreva( pular + "Nome do produto:")
	    		leia(nomeProduto[contador])
	    		se(nomeProduto[contador] == ""){
				escreva("Nenhum dado foi inserido."+pular)
			} senao{
	       		escreva("Dado foi inserido com sucesso."+pular)
            	}
        	}enquanto (nomeProduto[contador] == "")

        	faca {
        		escreva( pular + "Informe a Classificação ( A, B ou C) :")
			leia(classificacaoProduto[contador])
			se(classificacaoProduto[contador] == ""){
				escreva("Nenhum dado foi inserido."+pular)
			} senao{
	       		escreva("Dado foi inserido com sucesso."+pular)
            	}
        	}enquanto (classificacaoProduto[contador] == "")
		contador++
	}
	
	funcao Atualizar(){
		
		inteiro atualizacaoIndice = 0
        	escreva("Informe o numero do vetor que deseja atualizar!" + pular)
        	leia(atualizacaoIndice)
		
        	se (nomeProduto[atualizacaoIndice] == "") {
            	escreva("Esse produto não existe!" + pular)
  	 	}senao{	
  	 		faca {
  	 			escreva(pular + "Informe o novo nome do produto!")
           		leia(nomeProduto[atualizacaoIndice])

           		se(nomeProduto[atualizacaoIndice] == ""){
					escreva("Dado invalido."+pular)
				} senao{
	       			escreva("Dado foi inserido com sucesso."+pular)
            		}
  	 		}enquanto (nomeProduto[atualizacaoIndice] == "")	
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
      	classificacaoProduto[indice] = ""
      	estoqueProduto[indice] = 0.0
        }
	
	funcao Exibir(cadeia ordem){

	 	se (ordem == "D"){
			para (inteiro i = contador; i >= 0; i--){
				se (nomeProduto[i] != ""){
					escreva("Produto (" + i +"): " + nomeProduto[i] + pular)
				}
			}
		} senao {
			para (inteiro i = 0; i < contador; i++){
				se (nomeProduto[i] != ""){
					escreva("Produto (" + i +"): " + nomeProduto[i] + pular)
				}
			}
		}
	}

	funcao ExibirProdutoPorOrdem(){

		cadeia ordem = "" 
		//- C = crescente
		//- D = decrecente

		escreva(pular + "Informa a ordem (D) Decrecente ou (C) Crescente: ")
		leia(ordem)

		Exibir(ordem)
		
	}
	
	funcao AdicionarEstoque(){

		inteiro indiceEstoque = 0
		real soma = 0.0

		escreva("Informe o indice do Produto: ")
		leia(indiceEstoque)
		
		se (nomeProduto[indiceEstoque] == "") {
            	escreva("Indice Inváido!" + pular)
  	 	}senao{	
  	 		faca {
  	 			escreva(pular + "Informe a quanidade a ser adicionada!")
           		leia(soma)

           		se(estoqueProduto[indiceEstoque] < 0){
					escreva("Dado invalido."+pular)
				} senao{
	       			escreva("Dado foi inserido com sucesso."+pular)
	       			estoqueProduto[indiceEstoque] += soma
            		}
  	 		} enquanto (estoqueProduto[indiceEstoque] < 0)	
   		}
		
	}

	funcao RemoverEstoque(){

		inteiro indiceEstoque = 0
		real soma = 0.0

		escreva("Informe o indice do Produto: ")
		leia(indiceEstoque)
		
		se (nomeProduto[indiceEstoque] == "") {
            	escreva("Indice Inváido!" + pular)
  	 	}senao{	
  	 		faca {
  	 			escreva(pular + "Informe a quanidade a ser adicionada!")
           		leia(soma)

           		se(estoqueProduto[indiceEstoque] < 0){
					escreva("Dado invalido."+pular)
				} senao{
	       			escreva("Dado foi inserido com sucesso."+pular)
	       			estoqueProduto[indiceEstoque] -= soma
            		}
  	 		}enquanto (estoqueProduto[indiceEstoque] < 0)	
   		}
		
	}
	
	funcao Encerrar(){
		escreva(pular + "PROGRAMA ENCERRADO" + pular)
	}

}
