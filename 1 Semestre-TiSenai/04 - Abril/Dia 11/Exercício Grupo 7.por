programa
{
	
	funcao inicio()
	{

	cadeia tipoOperacao = ""
	real tensao = 0.0, corrente = 0.0, resistencia = 0.0
	real valorFinal = 0.0
	
	escreva("Informe o tipo de operação de deseja realizar:"
			+"\nDigite letra (V) para calcular a Tensão, (I) para calcular a Corrente e por último (R) para calcular a Resistência: ")
	leia(tipoOperacao)

	se(tipoOperacao == "V"){
		
		escreva("Informe a Corrente elétrica: ")
		leia(corrente)
		escreva("Informe Resistência elétrica: ")
		leia(resistencia)

		valorFinal = (corrente * resistencia)
	}se(tipoOperacao == "I"){
		
		escreva("Informe a Tensão elétrica: ")
		leia(tensao)
		escreva("Informe Resistência elétrica: ")
		leia(resistencia)

		valorFinal = (tensao * resistencia)
	}se(tipoOperacao == "R"){
		
		escreva("Informe a Tensão elétrica: ")
		leia(tensao)
		escreva("Informe Corrente elétrica: ")
		leia(corrente)

		valorFinal = (tensao * corrente)
	}

	escreva("O resultado da operação foi: "+valorFinal)


// Crie um algoritmo que realize o cálculo da primeira lei de ohm, lembrando que a primeira lei de ohm faz cálculos de Tensão, resistência e corrente.

//O usuário deverá informar a operação desejada com a letra "V" para calcular a Tensão, "I" para calcular a Corrente e por último "R" para calcular a Resistência.

//onde:

//> Tensão (V) é medida em volts (V)
//-> Corrente elétrica (I) é medida em amperes (A)
//-> Resistência (R) é medida em ohm (Ω)

//Para realizar os cálculos considere:

//Tensão(V) = Corrente(I) * Resistencia(R)
//Corrente(I) = Tensão(V) / Resistencia(R)
//Resistência(R) = Tensão(V) / Corrente(I)

//Assim o algoritmo deverá realizar as seguintes entradas e saídas:
//_______________________________________________________________

//Informe o tipo de operação de deseja realizar:
//(V) para tensão elétrica , (I) para corrente elétrica ou (R) para resistência elétrica: _V_
//Informe Resistência elétrica: ___
//Informe a Corrente elétrica: ___
//O resultado da operação foi :___
//________________________________________________________

//Assim deverá solicitar os dados a depender do tipo de operação selecionada.	
	}
}
