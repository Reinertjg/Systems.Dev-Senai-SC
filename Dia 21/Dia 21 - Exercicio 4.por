programa
{
	
	funcao inicio()
	{
	real numero1 = 0.0, numero2 = 0.0
	real divisao = 0.0

	escreva("Informe o número 1: ")
	leia(numero1)
	escreva("Informe o número 2: ")
	leia(numero2)
	se (numero1 == 0 )
		numero1 = 1
	se (numero2 == 0 )
		numero2 = 1
	divisao = (numero1 / numero2) 

	escreva("Resultado: "+divisao)


//Situação problema:

//Desenvolva um algoritmo em portugol para realizar a operação matemática de divisão.

//O programa deverá solicitar o numero 1 o numero 2, realizar a operação de sivisãoe imprimir o resultado.

//OBS: O sistema não deverá realizar a operação caso o usuário realize a divisão por zero, assim caso o usuário informe zero no dividendo o sistema deverá substituir por 1 quando for realizar a operação de divisão e assim evitar que a conta realize a divisão por zero!

//O programa deverá ter a entrada e saída de dados conforme o exemplo abaixo:


//Informe o número 1: ____

//Informe o número 2: ____

//Resultado: ______

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 81; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
