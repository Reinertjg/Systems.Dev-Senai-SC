import javax.swing.JOptionPane;
public class Exercício Switch Case 3 {

    public static void main(String[] args) {
        
        String significado = "",conceito = "";
        
        conceito = (JOptionPane.showInputDialog("Informe o conceito. "
                + "\n (A, B, C, D, E, F)"));
        
        switch(conceito){
            case "A" ->{
                significado = "Excelente";
            }
            case "B" ->{
                significado = "Ótimo";
            }
            case "C" ->{
                significado = "Bom";
            }
            case "D" ->{
                significado = "Regular";
            }
            case "E" ->{
                significado = "Ruim";
            }
            case "F" ->{
                significado = "Nos vemos de novo ano que vem...";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Conceito: " +significado);
        
        
        
        
    }
    
}
