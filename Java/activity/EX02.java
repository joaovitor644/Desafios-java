import javax.swing.JOptionPane;

public class EX02{
	public static void main(String[] args){
		float lucas,pedro;
		int ano1,ano2;

		lucas = 1.50f;
		pedro = 1.10f;
		ano1 = 0;
		ano2 = 0;

		while(lucas == pedro && pedro > lucas){
			pedro = pedro + 0.30f;
			ano2++;
			if(lucas != pedro){
				lucas = lucas + 0.20f;
				ano1++;
			}
		}
		
		System.out.println( "Lucas terá a alura igual a pedro daqui a "+ano1+" anos");
		System.out.println("Pedro vai ser maior que Lucas daqui a "+ano2+" anos");
		
	}
}
