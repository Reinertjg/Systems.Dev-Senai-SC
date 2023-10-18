programa
{
	
	funcao inicio()
	{
		cadeia resposta = "s"
		inteiro cc = 0
		inteiro contador = 0
		real media = 0.0
		real nota[99]

		faca{

			escreva("Informe a quantidade de notas: ")
			leia(cc)
		
			para(inteiro ii=0; ii<cc; ii++)
			{
				contador++
				escreva("Informe a Nota "+contador+" :")
				leia(nota[ii])
				media += nota[ii]
				
			}
			
			escreva("A media é: "+(media / contador))
			escreva("\nDeseja realizar mais um calculo(s ou n) :")
			leia(resposta)
			contador=0
			media=0.0
		
		}enquanto(resposta != "s" ou resposta != "S")
	}
}
/*Ao final o sistema irá realizar a saída com a média do aluno.

Requisitos:

O programa deve solicitar ao usuário o tamanho do vetor, que irá indicar a quantidade de notas a serem informadas.
O programa deve calcular a média dos elementos do vetor.
O programa deve exibir a média calculado com duas casas decimais.
O programa deve permitir que o usuário repita a operação quantas vezes desejar um aluno por vez
Após cada cálculo, o programa deve perguntar ao usuário se ele deseja realizar outro cálculo.
Caso o usuário não queira realizar outro cálculo, o programa deve encerrar.
Observações adicionais:

O exercício envolve a utilização de vetores para armazenar as notas inseridas pelo usuário.
O programa deve utilizar estruturas de repetição, como um loop, para permitir a repetição dos cálculos caso o usuário deseje.
O programa pode exibir mensagens de orientação para guiar o usuário durante a interação.
É importante garantir a validação dos dados inseridos pelo usuário, verificando se são números válidos.
