programa
{
	
cadeia nome = ""
	real idade = 0
	
	funcao inicio()
	{

		
	
		Imprime("Bem-Vindo")

		Entrada()
		Saida() 
		
		Imprime("Fim do programa")
	}
	funcao Imprime(cadeia texto)
	{
		escreva("***" + texto + "***\n")
	}
	funcao Entrada()
	{
		escreva("\nImforme seu nome: ")
		leia(nome)
		escreva("\nInforme sua idade")
		leia(idade)
	}
	funcao Saida()
	{
		escreva("\nSeu nome é: " + nome)
		escreva("\nSua idade é: " + idade)
	}
}
