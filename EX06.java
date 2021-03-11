import javax.swing.JOptionPane;

public class EX06{
	public static void main(String[] args){
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor:"));
		
		if(n % 2 == 0){
			n = n / 2;
		}
		else if(n % 2 == 1){
			n = n * 3 + 1;
		}
		else{
			JOptionPane.showMessageDialog(null,"ERRO digite novamente");
		}
		
		JOptionPane.showMessageDialog(null,"Resultado: "+n);
	}
}
