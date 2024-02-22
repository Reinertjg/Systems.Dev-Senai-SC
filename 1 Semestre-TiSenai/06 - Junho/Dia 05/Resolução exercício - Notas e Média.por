programa
{
	
inclua biblioteca Tipos --> t
	
	funcao inicio()
	{
		cadeia alunoNome = "", pular = "\n"
		inteiro qtdeNotas = 0
		real notas[999] , media = 0.0, somaNotas = 0.0
		caracter resposta = 'N'
		cadeia qtdeNotasTexto = ""
	
		//--Inicio do programa
		faca {
			limpa()

			faca{
				escreva("Informe o nome do aluno: ")
				leia(alunoNome)

				se (alunoNome == ""){
					escreva(pular + "Nome informado inválido!")
				}
				
			} enquanto (alunoNome == "")

			

			faca{
				escreva("Informe a quantidade de notas: ")
				leia(qtdeNotasTexto)
				se (qtdeNotasTexto == ""){
					escreva(pular + "Quantidade de notas informado inválido!")
				} senao {
					qtdeNotas = t.cadeia_para_inteiro(qtdeNotasTexto, 10)
					se (qtdeNotas <= 0){
						escreva(pular + "Quantidade de notas informado inválido!")	
						qtdeNotasTexto = ""
					}					
				}
			} enquanto (qtdeNotasTexto == "")


			
			//-Entrada das notas
			para (inteiro contador = 0; contador < qtdeNotas; contador++){
				//--Pedir as notas do aluno!!!
				escreva("Informe a nota (" + (contador + 1) + "): ")
				leia(notas[contador])				 
			}

			somaNotas = 0.0
			//--calcular soma total das notas
			para (inteiro contador = 0; contador < qtdeNotas; contador++){
				somaNotas += notas[contador]
			}

			media = somaNotas / qtdeNotas

			escreva("Média: " + media)
			
			escreva("Deseja continuar (S/N): ")
			leia(resposta)
			
		} enquanto (resposta == 'S')
		//--fim do programa
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 905; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
