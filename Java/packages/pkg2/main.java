import lib.Soma;
import lib.Subtracao;
import lib.Multiplicacao;
import lib.Divisao;

public class main {
    public static void main(String[] args){
        Soma s = new Soma();
        Subtracao su = new Subtracao();
        Multiplicacao mu = new Multiplicacao();
        Divisao di = new Divisao();

        System.out.println("Soma: "+ s.som(12,13));
        System.out.println("Subtração: "+su.sub(13,25));
        System.out.println("Multiplicação: "+mu.mult(12,12));
        System.out.println("Divisão: "+di.div(25,5));
    }
}