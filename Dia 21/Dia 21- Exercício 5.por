programa
{
	
	funcao inicio()
	{
		real numero1 = 0.0, numero2 = 0.0
		real resultado = 0.0
		cadeia operacao = "", soma = "", subtracao = "", divisao = "", multiplicacao =""
	
		escreva("Selecione a operação(soma, subtracao, divisao, multiplicacao: ")
		leia(operacao)

		se(operacao == "soma"){
			escreva("Informe o número 1: ")
			leia(numero1)
			escreva("Informe o número 2: ")
			leia(numero2)
			resultado = (numero1 + numero2) 
			
		}se(operacao == "subtracao"){
			escreva("Informe o número 1: ")
			leia(numero1)
			escreva("Informe o número 2: ")
			leia(numero2)
			resultado = (numero1 - numero2) 
		
		}se(operacao == "divisao"){
			escreva("Informe o número 1: ")
			leia(numero1)
			escreva("Informe o número 2: ")
			leia(numero2)
			resultado = (numero1 / numero2) 
		
		}se(operacao == "multiplicacao"){
			escreva("Informe o número 1: ")
			leia(numero1)
			escreva("Informe o número 2: ")
			leia(numero2)
			resultado = (numero1 - numero2) 
		
		}			
		
		escreva("Resultado: "+resultado)
	
	
	
	
	
//Crie um algoritmo que realize as contas matemáticas de soma, subtração, multiplicação e divisão entre dois números.

//O programa deverá realizar a pergunta ao usuário podendo escolher entre as operações.

//Quando o usuário informar "+" o programa irá realizar a soma.

//Quando o usuário informar "-" o programa irá realizar a subtração.

//Quando o usuário informar "/" o programa irá realizar a divisão.

//Quando o usuário informar "*" o programa irá realizar a multiplicação.

//Obs.: O programa não poderá permitir a realizar a conta de divisão onde o dividendo for igual a zero e assim substituir por 1.

//Exemplo de execução


//Selecione a operação: ___

//Número 1: _____

//Número 2: _____

//Resultado: _____
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 648; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */