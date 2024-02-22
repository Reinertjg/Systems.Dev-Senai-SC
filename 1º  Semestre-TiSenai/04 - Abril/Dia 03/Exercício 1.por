programa
{
	
	funcao inicio()
	{

		real numero1 = 0.0, numero2 = 0.0, numero3 = 0.0, numero4 = 0.0, numero5 = 0.0
		inteiro positivo = 0, negativo = 0

		escreva("Informe o Numero 1: ")
		leia(numero1)
		escreva("Informe o Numero 2: ")
		leia(numero2)
		escreva("Informe o Numero 3: ")
		leia(numero3)
		escreva("Informe o Numero 4: ")
		leia(numero4)
		escreva("Informe o Numero 5: ")
		leia(numero5)

		se(numero1 >= 0){
			positivo += 1
		}senao
			negativo += 1
		se(numero2 >= 0){
			positivo += 1
		}senao
			negativo += 1
		se(numero3 >= 0){
			positivo += 1
		}senao
			negativo += 1
		se(numero4 >= 0){
			positivo += 1
		}senao
			negativo += 1
		se(numero5 >= 0){
			positivo += 1
		}senao
			negativo += 1
		
		escreva("A quantidade de numeros positivos é:"+positivo+
			"\n A quantidade de numeros negativos é:"+negativo)
		
//Situação problema:
//
//Crie um algoritmo que realize a entrada de 5 números.
//
//Processe as entradas e contabilize quando números são negativos e quantos números são positivos.
//
//Ao final imprima a quantidade de números de cada tipo.
//
//----------------------------------------------------------------------------
//
//Informe o numero 1: ___
//
//Informe o numero 2: ___
//
//Informe o numero 3: ___
//
//Informe o numero 4: ___
//
//Informe o numero 5: ___
//
//Quantidade de números negativos: 3
//
//Quantidade de números positivos: 2
	}
}
