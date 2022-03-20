package lib;

public class Print {
    public String msg;

    public void print(){
        if(this.msg != null){
           System.out.println(this.msg); 
        }
        else {
            System.out.println("Erro ,have not value in msg");
        }
    }
    public String pickMsg(String message){
        return this.msg = message;
    }
}
