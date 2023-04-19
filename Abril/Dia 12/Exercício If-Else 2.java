import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        byte idade = 0;
        String mensagem = ""

        idade = Byte.parseByte(JOptionPane.showInputDialog("Informe sua idade!!"));

        if (idade < 16) {
            mensagem = ("Não Eleitor");
        }
        else if(idade >= 18 && idade <= 65){
            mensagem = ("Eleitor Obrigatório");
        }
        else{
            mensagem = ("Eleitor Facultativo");
        }

        JOptionPane.showMessageDialog(null, mensagem)
// 2 - Situação problema: Verificar a classe eleitoral de uma pessoa. Ler a idade. Verificar se a idade é 
// menor que 16(não eleitor), entre 18 e 65 anos (eleitor obrigatório) ou idade igual a 16 ou 17 ou
//     maior que 65 (eleitor facultativo). Informar a idade e mostrar na tela em qual grupo a idade se enquadra.
    }
}
