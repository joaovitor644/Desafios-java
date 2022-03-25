public class Main{
    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();

        t1.setN1(12);
        t1.setN2(12);
        t1.operation(3);

        t2.setN1(12);
        System.out.println(t2.getN2());
        t2.operation(1);
    }
}
public class Test{
    private int n1;
    private int n2;

    public void setN1(int num1){
        this.n1 = num1;
    }
    public void setN2(int num2){
        this.n2 = num2;
    }

    public int getN1(){
       return this.n1;
    }
    public int getN2(){
        return this.n2;
    }

    public void operation(int op){
        try{
            switch(op){
                case 1:
                    System.out.println(this.getN1() + this.getN2());
                    break;
                case 2:
                    System.out.println(this.getN1() - this.getN2());
                    break;
                case 3:
                    System.out.println(this.getN1() * this.getN2());
                    break;
                case 4:
                    System.out.println(this.getN1() / this.getN2());
                    break;
                default:
                    System.out.println("ERRO, Opção inválida");
                    break;
            }
        }catch(Exception e){
            System.out.println("Erro");
        }
    }
}

