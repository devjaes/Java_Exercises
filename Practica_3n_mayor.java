import javax.swing.JOptionPane;
public class Practica_3n_mayor {
    public static void main(String[] args) {
      
        try {int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer número: "));
        if (n1 >= n2 && n2 >= n3) {
            JOptionPane.showMessageDialog(null, "El orden es: " + n1 + ", " +n2 + ", "+ n3);
        } else if (n1 >= n3 && n3 >= n2){
            JOptionPane.showMessageDialog(null, "El orden es: " + n1 + ", " +n3 + ", "+ n2);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa números pete " + e);
        }    
    }
}