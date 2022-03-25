
public class Main2 extends Test{
    public static void main(String[] args){
        t1();
        teste2();
        System.out.println(teste3(2,3));
        System.out.println(new Test().teste4(2,3));
    
    }
}
public class Test{
    public static void t1(){
        System.out.println("teste1");
    }
    public static void teste2(){
        System.out.println("teste2");
    }
    public static int teste3(int n1,int n2){
        return n1 + n2;
    }
    public int teste4(int n3, int n4){
        return n3 * n4;
    }
}

