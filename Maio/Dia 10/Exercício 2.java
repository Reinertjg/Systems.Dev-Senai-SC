import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args) {
        
        int cc = 0;
        int yesOrNo = 0;
        int qntPessoas = 0, salarioAte100 = 0;
        float mediaSalario = 0.0f, mediaFilhos = 0.0f,  maiorSalario = 0.0f;
        float qntFilhos = 0.0f, salario = 0.0f, qntSalario = 0.0f;

        do{
            salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario"));
            qntFilhos =+ Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a quantidade de filhos"));
            
            if(salario <= 100){
                salarioAte100++;
            }
            if(salario > maiorSalario){
                maiorSalario = salario;
            }
            qntSalario =+ salario;
            qntPessoas++;

            yesOrNo =  JOptionPane.showConfirmDialog(null,
            "Deseja fazer mais uma pesquisa?","Pesquisa",
            JOptionPane.YES_NO_OPTION);
            if(yesOrNo == JOptionPane.NO_OPTION){
                cc++;
            }

        }while(cc != 1);
        
        mediaSalario = (qntSalario / qntPessoas);
        mediaFilhos = (qntFilhos / qntPessoas);

        JOptionPane.showMessageDialog(null, "Média Salarial da população: "+mediaSalario
            +"\n Média do números de filhos: "+mediaFilhos
            +"\n Maior salário: "+maiorSalario);
            

    }  
}
// 3. A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o
// salário e número de filhos. A prefeitura deseja saber:
// a) média do salário da população;
// b) média do número de filhos;
// c) maior salário;
// d) percentual de pessoas com salário até R$100,00.
// O final da leitura de dados se dará com a entrada de um salário negativo. (Use o comando
// ENQUANTO-FAÇA)
