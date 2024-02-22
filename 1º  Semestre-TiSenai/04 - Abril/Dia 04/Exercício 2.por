programa
{
	
	funcao inicio()
	{
		cadeia PrimeiraViagemNome = "", SegundaViagemNome = "", TerceiraViagemNome = ""
		cadeia PrimeiraMaiorViagemNome = "", SegundaMenorViagemNome = ""
		real PrimeiroKilometroInicial = 0.0, PrimeiroKilometroFinal = 0.0
		real SegundoKilometroInicial = 0.0, SegundoKilometroFinal = 0.0
		real TerceiroKilometroInicial = 0.0, TerceiroKilometroFinal = 0.0
		real PrimeiroKilometroMaior = 0.0, SegundoKilometroMaior = 0.0, TerceiroKilometroMaior = 0.0
		real MaiorKilometro = 0.0, MenorKilometro = 0.0
		
			
		escreva("Nome da Primeira Viagem: ")
		leia(PrimeiraViagemNome)
		escreva("Kilometro inicial da Rodovia: ")
		leia(PrimeiroKilometroInicial)
		escreva("Kilometro final da Rodovia: ")
		leia(PrimeiroKilometroFinal)
		
		escreva("Nome da Segundo Viagem: ")
		leia(SegundaViagemNome)
		escreva("Kilometro inicial da Rodovia: ")
		leia(SegundoKilometroInicial)
		escreva("Kilometro final da Rodovia: ")
		leia(SegundoKilometroFinal)

		escreva("Nome da Terceira Viagem: ")
		leia(TerceiraViagemNome)
		escreva("Kilometro inicial da Rodovia: ")
		leia(TerceiroKilometroInicial)
		escreva("Kilometro final da Rodovia: ")
		leia(TerceiroKilometroFinal)
		
		
		PrimeiroKilometroMaior = (PrimeiroKilometroFinal - PrimeiroKilometroInicial)
		SegundoKilometroMaior = (SegundoKilometroFinal - SegundoKilometroInicial)
		TerceiroKilometroMaior = (TerceiroKilometroFinal - TerceiroKilometroInicial)

		MaiorKilometro = PrimeiroKilometroMaior
		PrimeiraMaiorViagemNome = PrimeiraViagemNome
		se(MaiorKilometro < SegundoKilometroMaior){
			MaiorKilometro = SegundoKilometroMaior
			PrimeiraMaiorViagemNome = SegundaViagemNome
		}se(PrimeiroKilometroMaior < TerceiroKilometroMaior){
			MaiorKilometro = TerceiroKilometroMaior
			PrimeiraMaiorViagemNome = TerceiraViagemNome
		}

		MenorKilometro = PrimeiroKilometroMaior
		SegundaMenorViagemNome = PrimeiraViagemNome
		se(MenorKilometro > SegundoKilometroMaior){
			MaiorKilometro = SegundoKilometroMaior
			SegundaMenorViagemNome = SegundaViagemNome
		}se(MenorKilometro > TerceiroKilometroMaior){
			MenorKilometro = TerceiroKilometroMaior
			SegundaMenorViagemNome = TerceiraViagemNome
		}
		
		escreva("A maior viagem é a "+PrimeiraMaiorViagemNome+" tem "+MaiorKilometro+" kilometros")
		escreva("\nA menor viagem tem "+SegundaMenorViagemNome+" tem "+MenorKilometro+" Kilometros")
//Crie um algoritmo para realizar a entrada de três viagens distintas e solicite para cada viagem os seguintes campos:
//
//- Nome da viagem
//
//- Kilometro inicial da rodovia
//
//- Kilometro final da rodovia
//
//A viagem se dará sempre na mesma rodovia porém o kilometro inicial e final será sempre relativo á rodovia.
//
//A rodovia inicia em kilometro 1 e termina no kilometro 99.
//
//Exemplo de viagens:
//
//Nome da viagem: viagem ao sitio 
//
//Kilometro inicial: 10
//
//kilometro final 20
//
//-------------------------------------
//
//Nome da viagem: viagem a praia
//
//Kilometro inicial: 2
//
//kilometro final 50
//
//--------------------------------------
//
//Ao final o programa deverá informar o valor em kilometros da maior viagem e da menor viagem.
//
//Exemplo de resultado esperado:
//
//-> A maior viagem é a "viagem a praia" tem "48" kilometros
//
//-> A menor viagem a "viagem ao sitio " tem "10" kilometros
	}
}
