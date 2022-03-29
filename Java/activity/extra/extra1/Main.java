import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import lib.Button;
import lib.Input;
import lib.Label;
import lib.Window;

public class Main implements ActionListener {
    int i = 0;
    Button b1 = new Button("Click",200,50,122,250);
    Label lab2 = new Label("Primeiro Valor", 150, 50, 30, 103);
    Label lab3 = new Label("Segundo Valor", 150, 50, 30, 63);
    Input in1 = new Input(200,20,142,122);
    Input in2 = new Input(200,20,142,82);
    Window win = new Window(450,450,"Atividade - 1");
    Label lab1 = new Label(" ",450,50,0,375);
    
    double result1;
    long result2;
    long result3;
    long result4;
     
    public Main(){
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
        new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1.btm){
            int n1 = Integer.parseInt(in1.getInput().getText());
            int n2 = Integer.parseInt(in2.getInput().getText());
            
            result1 = n1 / n2;
            result2 = n1 + n2;
            result3 = n1 * n2;
            result4 = n1 - n2;
            
            lab1.getLabel().setText(
                "Soma: "+ result2 + " | " +
                "Subtração: "+ result4 + " | " +
                "Multiplicação: "+ result3 + " | " +
                "Divisão: "+ result1
            );
        }
    }
}
