programa
{
	
	funcao inicio()
	{
		cadeia origem1, origem2, origem3
		cadeia destino1, destino2, destino3
		cadeia textoimpressovalor = "", textoimpressodistancia = ""
		real distancia1, distancia2, distancia3
		real valor1, valor2, valor3
		real menorvalor, maiordistancia, viagemmenor, viagemmaior

		escreva("Viagem 1 \n")
		escreva("Origem de: ")
		leia(origem1)
		escreva("Destino: ")
		leia(destino1)
		escreva("Distancia em quilômetros: ")
		leia(distancia1)
		escreva("Valor em reais: ")
		leia(valor1)

		escreva("Viagem 2 \n")
		escreva("Origem de: ")
		leia(origem2)
		escreva("Destino: ")
		leia(destino2)
		escreva("Distancia em quilômetros: ")
		leia(distancia2)
		escreva("Valor em reais: ")
		leia(valor2)

		escreva("Viagem 3 \n")
		escreva("Origem de: ")
		leia(origem3)
		escreva("Destino: ")
		leia(destino3)
		escreva("Distancia em quilômetros: ")
		leia(distancia3)
		escreva("Valor em reais: ")
		leia(valor3)

			menorvalor = valor1
			viagemmenor = 1

		se (valor2 < menorvalor)
			menorvalor = valor2
			viagemmenor = 2
		se (valor3 < menorvalor)
			menorvalor = valor3
			viagemmenor = 3

		se(viagemmenor == 1)
			textoimpressovalor = ("Origem; "+origem1+". Destino: "+destino1+". Distancia: "+distancia1+". Valor: "+valor1)
		se(viagemmenor == 2)
			textoimpressovalor = ("Origem; "+origem2+". Destino: "+destino2+". Distancia: "+distancia2+". Valor: "+valor2)
		se(viagemmenor == 3)
			textoimpressovalor = ("Origem; "+origem3+". Destino: "+destino3+". Distancia: "+distancia3+". Valor: "+valor3)

			maiordistancia = distancia1
			viagemmaior = 1
			
		se (distancia2 > maiordistancia)
			maiordistancia = distancia2
			viagemmaior = 3
		se (distancia3 > maiordistancia)
			maiordistancia = distancia3
			viagemmaior = 3

		se(viagemmaior == 1)
			textoimpressodistancia = ("Origem; "+origem1+". Destino: "+destino1+". Distancia: "+distancia1+". Valor: "+valor1)
		se(viagemmaior == 2)
			textoimpressodistancia = ("Origem; "+origem2+". Destino: "+destino2+". Distancia: "+distancia2+". Valor: "+valor2)
		se(viagemmaior == 3)
			textoimpressodistancia = ("Origem; "+origem3+". Destino: "+destino3+". Distancia: "+distancia3+". Valor: "+valor3)

		escreva("Viagem de menor valor: ")
		escreva(textoimpressovalor)
		escreva("Viagem de maior distancia: ")
		escreva(textoimpressodistancia)

		
//Crie um programa em Portugol para realizar a entrada de informações de viagens por aplicativo.
//O programa deverá solicitar para cada viagem quatro informações:
//- Origem de: (exe: Rua São Paulo)
//- Destino: (exe: Rua XV de Novembro)
//- Distancia em quilômetros: (exe: 3)
//- Valor em reais: (exe: 7.50)
//O programa deverá solicitar como dados de entrada três viagens com todos os dados necessários.
//Ao final o programa deverá imprimir os dados da viagem de menor valor e a viagem de maior distancia.
//Caso a menor viagem em valor e a maior viagem em distancia sejam a mesma o sistema irá realizar a impressão duas vezes para exibir a viagem de menor valor e a viagem de maior distancia conforme o exemplo de impressão.
//Exemplo:
//Viagem de menor valor:
//Origem: Rua São Paulo. Destino: Rua XV de Novembro. Distancia: 3 KM. Valor:  R$ 7.50
//Viagem de maior distancia:
//Origem: Rua São Paulo. Destino: Rua XV de Novembro. Distancia: 3 KM. Valor:  R$ 7.50
	}
}
