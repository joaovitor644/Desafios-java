import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import lib.Button;
import lib.Input;
import lib.Label;
import lib.Window;

public class GUI implements ActionListener {
    int i = 0;
    Button b1 = new Button("Click",200,50,122,250);
    Label lab2 = new Label("Numero 1", 150, 50, 20, 103);
    Label lab3 = new Label("Numero 2", 150, 50, 20, 63);
    Input in1 = new Input(200,20,122,122);
    Input in2 = new Input(200,20,122,82);
    Window win = new Window(450,450,"My title");
    Label lab1 = new Label("This is a label",450,20,0,375);
    public GUI(){
        win.getWindow().add(in1.getInput());
        win.getWindow().add(in2.getInput());
        win.getWindow().add(lab3.getLabel());
        win.getWindow().add(lab2.getLabel());
        win.getWindow().add(b1.btm);
        win.getWindow().add(lab1.getLabel()); 
        lab1.getLabel().setHorizontalAlignment(JLabel.CENTER);
        b1.btm.addActionListener(this);
    }
    public static void main(String[] args){
        new GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1.btm){
            int n1 = Integer.parseInt(in1.getInput().getText());
            int n2 = Integer.parseInt(in2.getInput().getText());
            lab1.getLabel().setText("Resultado: "+ (n1 + n2));
        }
    }
}
