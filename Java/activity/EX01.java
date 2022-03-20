import javax.swing.JOptionPane;

public class EX01{
	public static void main(String[] args){
		float som,num,media;
		int cont;

		som = 0;
		cont = 0;

		do{
			num = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um número"));
			som = som + num;
			cont++;
		}while(cont < 20);
		
		media = som / cont;
		JOptionPane.showMessageDialog(null,"A média dos valores deu " + media);
	}
}
