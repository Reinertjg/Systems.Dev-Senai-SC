# Faculdade
Faculdade
https://www.dell.com/pt-br/shop/laptops/inspiron-15-3000-intel/spd/inspiron-15-3511-laptop/i3511u304w
https://www.dell.com/pt-br/shop/notebooks/notebook-inspiron-15-5000/spd/inspiron-15-5510-laptop/i5510u4505w
programa
{
	
	funcao inicio()
	{
		inteiro i = 0
		inteiro ct = 1
		real notas[99]

		escreva("Digite a quantidade de notas deseja informar: ")
		leia(i)

		

		para(inteiro cc = 0; cc<i; cc++)
		{
			escreva("Digite a "+cc+"° nota: ")
			leia(notas[cc])
			ct++
		}
	}
}
/*Requisitos:

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
