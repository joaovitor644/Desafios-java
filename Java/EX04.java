import javax.swing.JOptionPane;

public class EX04{
    public static void main(String[] args){
        int n1,n2;
        int intnum = 0;
        int posnum = 0;
        int parnum = 0;
        int imparnum = 0;
        int div73num = 0;
        int cont;
        double media;
        int som = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de inicio"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do fim"));

        if(n1 > n2){
            JOptionPane.showMessageDialog(null,"Erro digite Novamente");
        }
        else{
            cont = n1 + 1;

            while(cont <= n2){
                if(cont > 0 ){
                    intnum++;
                    posnum++;
                }
                else{
                    intnum++;
                }

                if(cont % 2 == 0){
                    parnum++;
                }
                else{
                    imparnum++;
                }

                if(cont % 2 == 1 && cont % 7 == 0 && cont % 3 == 0){
                    div73num++;
                }
                som = som + cont;
                cont++;
            }
            media = som / intnum;

            JOptionPane.showMessageDialog(null,"Total de números inteiros:"+intnum+"\n"+"Total de números positivos:"+posnum+"\n"+"Total de números Pares:"+parnum+"\n"+"Total de números impares:"+imparnum+"\n"+"Total de números divisiveis por 3 e 7:"+div73num+"\n"+"Media total:"+media);
        }
    }
}