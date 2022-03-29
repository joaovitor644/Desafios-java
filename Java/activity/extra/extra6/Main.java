import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import lib.Button;
import lib.Input;
import lib.Label;
import lib.Window;

public class Main implements ActionListener {
    Button b1 = new Button("Click",200,50,122,250);
    Label lab2 = new Label("Valor da aplicação", 180, 50, 5, 103);
    Input in1 = new Input(200,20,142,122);
    Window win = new Window(450,450,"Atividade - 6");
    Label lab1 = new Label(" ",450,50,0,375);
    final float porc = 0.007f;
     
    public Main(){
        win.getWindow().add(in1.getInput());
        win.getWindow().add(lab2.getLabel());
        win.getWindow().add(b1.btm);
        win.getWindow().add(lab1.getLabel()); 
        lab1.getLabel().setHorizontalAlignment(JLabel.CENTER);
        b1.btm.addActionListener(this);
    }
    public static void main(String[] args){
        new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1.btm){
            int n1 = Integer.parseInt(in1.getInput().getText());
            float mont = (n1 * porc) + n1;
            lab1.getLabel().setText("Após um mês,o rendimento da poupança ficará R$"+mont);
        }
    }
}
