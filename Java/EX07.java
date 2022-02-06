 import javax.swing.JOptionPane;

public class EX07{
	public static void main(String[] args){
		int n;
		float res;

		n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));

		if(n % 2 == 0){
			res = n / 2;
			JOptionPane.showMessageDialog(null,n +" é Par\n O resultado é "+res);
		}else{
			res = (n * 3) + 1;
			JOptionPane.showMessageDialog(null,n +" é Impar\n O resultado é "+res); 
		}
	}
}
