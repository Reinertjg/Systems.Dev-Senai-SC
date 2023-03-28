programa
{
	
	funcao inicio()
	{
		real numero1 = 0.0, numero2 = 0.0, numero3 = 0.0
		real resultado = 0.0,  resultado2 = 0.0
		cadeia operacao = ""

	
		escreva("Selecione a operação( +, -, / ou * ): ")
		leia(operacao)
		
		escreva("Informe o número 1: ")
			leia(numero1)
			escreva("Informe o número 2: ")
			leia(numero2)

		se(operacao == "+"){
			resultado = (numero1 + numero2) 
			
		}se(operacao == "-"){
			resultado = (numero1 - numero2) 
		
		}se(operacao == "/"){
				se (numero1 == 0 )
					numero1 = 1
				se (numero2 == 0 )
					numero2 = 1
				resultado = (numero1 / numero2) 
		
		}se(operacao == "*"){

			resultado = (numero1 * numero2) 
		
		}			
		escreva("Selecione a segunda operação( +, -, / ou * ): ")
		leia(operacao)
		escreva("Informe o número 3: ")
		leia(numero3)
		
		se(operacao == "+"){
			resultado2 = (resultado + numero3) 
			
		}se(operacao == "-"){
			resultado2 = (resultado - numero3) 
			
		}se(operacao == "/"){
				se (numero1 == 0 )
					numero1 = 1
				se (numero2 == 0 )
					numero2 = 1
			resultado2 = (resultado / numero3)
			
		}se(operacao == "*"){
			resultado2 = (resultado * numero3)
		}	
		
		escreva("Resultado: "+resultado2)
		
	
	
	
	
	
//Situação problema:
//Crie um algoritmo que realize as contas matemáticas de soma, subtração, multiplicação e divisão entre dois números.
//Na sequencia o programa deverá realizar uma segunda conta matemática entre o resultado da primeira conta e um novo numero que será chamado de numero 3.
//O programa deverá realizar a pergunta ao usuário podendo escolher entre as operações.
//Quando o usuário informar "+" o programa irá realizar a soma.
//Quando o usuário informar "-" o programa irá realizar a subtração.
//Quando o usuário informar "/" o programa irá realizar a divisão.
//Quando o usuário informar "*" o programa irá realizar a multiplicação.
//Obs.: O programa não poderá permitir realizar a conta de divisão onde o dividendo for igual a zero e assim substituir por 1 para evitar a divisão por zero.
//Exemplo de execução

//selecione a primeira operação: ___
//Número 1: _____
//Número 2: _____
//Resultado1: ______
//Selecione a segunda operação: ___
//Número 3: _____
//Resultado 2*: ______
//-------------------------------------------------------------
//O resultado 2 será a soma ou subtração ou divisão ou multiplicação do resultado 2 com o numero 3.

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
