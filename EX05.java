import javax.swing.JOptionPane;

public class EX05{
    public static void main(String[] args){
        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));

       for(int a = 0, b = 1, i = 0; i < n1; b += a, a = b-a, i++) {
			System.out.print(a + " ");
		}  
    }
}