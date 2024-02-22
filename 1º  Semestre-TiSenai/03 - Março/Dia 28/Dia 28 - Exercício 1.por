programa
{
	
	funcao inicio()
	{
		real ladoA = 0.0, ladoB= 0.0, ladoC = 0.0

		escreva("Infome o tamanho do lado A: ")
		leia(ladoA)
		escreva("Infome o tamanho do lado B: ")
		leia(ladoB)
		escreva("Infome o tamanho do lado C: ")
		leia(ladoC)

		se(((ladoA + ladoB) > ladoC) e ((ladoB + ladoC) > ladoA) e ((ladoA + ladoC) > ladoB)){
			se((ladoA == ladoB) e (ladoB == ladoC)){
				escreva("Triângulo equilátero")
			}senao{
				se((ladoA == ladoB) ou (ladoB == ladoC) ou (ladoA == ladoC)){
                    	escreva("Triângulo isósceles") 
				}senao{
					escreva("Triângulo escaleno")
				}
			}
		}senao{
			escreva("Não é possível formar um triângulo com os valores informados")	
		}
	}	
}
