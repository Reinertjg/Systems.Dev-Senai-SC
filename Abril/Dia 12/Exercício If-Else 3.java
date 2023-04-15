import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args) throws Exception {
        
        byte idade = 0;

        idade = Byte.parseByte(JOptionPane.showInputDialog("Informe sua idade!!"));

        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Menor de Idade");
        }
        else if(idade >= 18 && idade <= 64){
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }
        else{
            JOptionPane.showMessageDialog(null, "Idoso");
        }
//3 - Situação problema: Verificar se a idade é menor que 18 (menor de idade), entre 18 e 64 anos
//(maior de idade) ou maior ou igual a 65 anos (idoso). Informar a idade e mostrar na tela em que 
//grupo a idade se enquadra.
    }
}
