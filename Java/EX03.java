import java.util.Scanner;
   
public class Test{
	public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
   
        System.out.println("Digite um número:");
        int n1 = Integer.parseInt(teclado.nextLine());
		
		int cont = 1;
		int res; 

		while(cont <= 10){
			res = n1 * cont;
			System.out.println(n1+" x "+cont+" = "+res);
			cont++;			
		}

 
	}
}

