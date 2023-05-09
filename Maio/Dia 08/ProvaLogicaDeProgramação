programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia nomeAluno =""
		cadeia mensagemTipoExercicio = "" 
		real alturaAluno = 0.0, pesoAluno = 0.0
		real caloriasSemanais = 0.0, imcAluno = 0.0
		real valorDoDesconto = 0.0
		inteiro valorDoPlano = 0
		inteiro valorMusculacao = 80, valorCorrida = 20, valorBicicleta = 30
		
		escreva("Digite o Nome do Aluno: ")
		leia(nomeAluno)
		
		escreva("Digite o Peso do Aluno em quilos: ")
		leia(pesoAluno)
		
		escreva("Digite o Alura do Aluno em metros (Ex: 1.72): ")
		leia(alturaAluno)
		
		escreva("Digite o quantidade de calorias a serem gastas na semana: ")
		leia(caloriasSemanais)

		se(caloriasSemanais <= 450){
			mensagemTipoExercicio = "\n- Musculação: "+caloriasSemanais+" calorias"
			valorDoPlano = valorMusculacao
		}	
		senao se(caloriasSemanais > 450 e caloriasSemanais <= 1850){
			mensagemTipoExercicio = "\n- Musculação: 450.0 calorias"
				+"\n- Corrida: "+(caloriasSemanais-450)+" calorias"
			valorDoPlano = (valorMusculacao + valorCorrida)
		}
		senao{
			mensagemTipoExercicio = "\n- Musculação: 450.0 calorias"
				+"\n- Corrida: 1400.0 calorias"
				+"\n- Bicicleta Ergonômica: "+(caloriasSemanais-1850)+" calorias"
			valorDoPlano = (valorMusculacao + valorCorrida + valorBicicleta)
		}
		se(caloriasSemanais >= 4000){
			valorDoDesconto = (valorDoPlano / 2)
		}

		imcAluno = mat.arredondar(pesoAluno / mat.potencia(alturaAluno,2),2)
				
		escreva("---------------------------"
			+"\nIMC: "+imcAluno
			+"\nLista de Exercício:"+mensagemTipoExercicio
			+"\nValor do Plano: R$ "+valorDoPlano
			+"\nDesconto: R$ "+valorDoDesconto
			+"\nValor a pagar: R$ "+(valorDoPlano-valorDoDesconto))
	}
}
