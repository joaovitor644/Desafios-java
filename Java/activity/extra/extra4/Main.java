import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import lib.Button;
import lib.Input;
import lib.Label;
import lib.Window;

public class Main implements ActionListener {
    //elements
    
    Button b1 = new Button("Click",200,50,122,250);
    Label lab2 = new Label("Prova 1", 150, 55, 50, 62);
    Label lab3 = new Label("Prova 2", 150, 55, 50, 92);
    Label lab4 = new Label("Prova 3", 150, 55, 50, 122);
    Label lab5 = new Label("Nome", 150, 50, 55, 32);
    Input nam = new Input(200,20,142,52);
    Input in1 = new Input(200,20,142,82);
    Input in2 = new Input(200,20,142,112);
    Input in3 = new Input(200,20,142,142); 
    Window win = new Window(450,450,"Atividade - 4");
    Label lab1 = new Label(" ",450,50,0,375);
    double media;
    public Main(){
        win.getWindow().add(nam.getInput());
        win.getWindow().add(in1.getInput());
        win.getWindow().add(in2.getInput());
        win.getWindow().add(in3.getInput());
        win.getWindow().add(lab3.getLabel());
        win.getWindow().add(lab2.getLabel());
        win.getWindow().add(lab5.getLabel());
        win.getWindow().add(lab4.getLabel());
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
            int n3 = Integer.parseInt(in3.getInput().getText());
            String name = nam.getInput().getText();

            media = (n1+n2+n3)/3;
            
            lab1.getLabel().setText(
                "Nome: "+ name + " | " +
                "Média: "+ media
            );
        }
    }
}
