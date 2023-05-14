import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args) throws Exception {
       
        int resposta = 0;

        while(resposta == 0){
            if (JOptionPane.showConfirmDialog(null, "VOCÊ ME AMA ISADORA?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "EU TBM TE AMO MEU AMOR");
                resposta++;
            } else {
                JOptionPane.showMessageDialog(null, "VOCÊ ME AMA ISADORA?, NÃO ENTENDI");
            }
            
        }
        
    }
}
