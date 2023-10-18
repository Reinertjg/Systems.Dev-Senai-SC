programa
{
	
	funcao inicio()
	{
		inteiro	numero1 = 0, numero2 = 0, numero3 = 0
		inteiro NumeroMenor = 0, NumeroMedio = 0, NumeroMaior = 0

		escreva("Informe o primeiro numero!: ")
		leia(numero1)
		escreva("Informe o segundo numero!: ")
		leia(numero2)
		escreva("Informe o terceiro numero!: ")
		leia(numero3)
		
		NumeroMenor = numero1
		se(NumeroMenor > numero2){
			NumeroMenor = numero2
		}se(NumeroMenor > numero3){
			NumeroMenor = numero3
		}
		
 		se((numero1 > numero2 e numero1 < numero3) ou (numero1 > numero3) e (numero1 < numero2)){
 			NumeroMedio = numero1
 		}
		senao se((numero2 > numero1 e numero2 < numero3) ou (numero2 > numero3) e (numero2 < numero1)){
			NumeroMedio = numero2			
		}
		senao{
			NumeroMedio = numero3
		}

		NumeroMaior = numero1
        se(NumeroMaior < numero2){
            NumeroMaior = numero2
        }se(NumeroMaior < numero3){
            NumeroMaior = numero3
        }

        escreva("O Menor Numero é: "+NumeroMenor+
        		"\nO Maior Nuemro é: "+NumeroMaior+
        		"\nO Numero do meio é: "+NumeroMedio)
		
//Situação problema:
//
//Crie um algoritmo que solicite três números inteiros diferentes entre si.
//
//Processe estes números e encontre:
//
//1 - O maior número.
//
//2 - O menor número.
//
//3 - O número do meio.
//
//-----------------------------------------------------------------
//
//Informe o número 1: ___
//
//Informe o número 2: ___
//
//Informe o número 3: ___
//
//++++++++++++++++++++++++++++++++
//
//O maior número é: ___
//
//O menor número é: ___
//
//O numero do meio é: ___
//
//++++++++++++++++++++++++++++++++
	}
}
