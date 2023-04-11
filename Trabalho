funcao inicio() {

		cadeia tipoCombustivel = ""
		cadeia formaPagamento = ""
		cadeia null = ""
		real valorColocado = 0.0,  litrosTotal = 0.0
		real valorPorLitro = 0.0, valorTotal = 0.0, totalImposto = 0.0
		real etanol = 3.75, gComum = 5.35, gAditivada = 5.85, diselS10 = 6.69
	
		escreva("Informe o tipo de combustivel \n(etanol, gasolina comum, gasolina aditivada e disel):")
		leia(tipoCombustivel)
		escreva("Informe o valor a ser colocado: ")
		leia(valorColocado)
		escreva("Informe a forma de pagamento (dinheiro, debito ou credito): ")
		leia(formaPagamento)
		escreva("Informe quem o atendeu: ")
		leia(null)
		escreva("Informe uma avaliação do frentista de 0 a 5. ")
		leia(null)
	
		se(tipoCombustivel == "etanol"){
			litrosTotal = (valorColocado / etanol)
			valorPorLitro = etanol
			
		}se(tipoCombustivel == "gasolina comum"){
			litrosTotal = valorColocado / gComum
			valorPorLitro = gComum
			
		}se(tipoCombustivel == "gasolina aditivada"){
			litrosTotal = valorColocado / gAditivada
			valorPorLitro = gAditivada
			
		}se(tipoCombustivel == "disel"){
			litrosTotal = valorColocado / diselS10
			valorPorLitro = diselS10
		}

		valorTotal = valorColocado
		se(formaPagamento == "dinheiro"){
			valorTotal = (valorColocado - (valorColocado * 0.07))
		}
		
		totalImposto = (valorTotal * 0.17)

		escreva("--------------------------------------------")
		escreva("\nTipo de combustivel: "+tipoCombustivel+" R$"+valorPorLitro+ " por Litro")
		escreva("\nvalor total de litros: "+litrosTotal+" Litros")
		escreva("\nValor Total: R$"+valorTotal)
		escreva("\nTotal de Imposto: R$"+totalImposto)
		
// Posto Heisenberg decidiu implementar um sistema
//de registro de vendas para ajudar a controlar as vendas de gasolina.
//Resolva a situação problema contendo as seguintes perguntas ao cliente:
//Informe o tipo do combustivel
//Informe o valor a ser colocado
//Informe a forma de pagamento
//Informe quem o atendeu
//Informe uma avaliação do frentista de 0 a 5.
//
//Use os seguntes Dados:
//Etanol (comum): 3,75
//Gasolina Comum: 5,35
//Gasolina Aditivada: 5,85
//Disel (S-10): 6,69

//caso o pagamento tenha sido em dinheiro ou pix o desconto é de 7%, caso tenha sido credito ou debito permanece o valor sem desconto.
//E o valor do imposto por litro de cada combustivel é de 17%, levando em consideração oque os valores a cima ja estão com imposto.

//Ao final deve aparecer:
//O tipo de combustivel e o valor por litro:
//valor total de litros:
//valor total com desconto (caso tenha sido em dinheiro ou pix):
//Valor total de impostos:

//Exemplo
//---------------------------------------------
//EX. Tipo de combustivel: Etanol R$3,75 por litro
//EX. Valor total de litros: 13.33 litros
//EX. Valor total: R$46.5 (com desconto se houver)
//EX. Total de Imposto: R$8.5

	}
}
