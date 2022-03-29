import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import lib.Button;
import lib.Input;
import lib.Label;
import lib.Window;

public class Main implements ActionListener {
    //elements
    
    Button b1 = new Button("Click",200,40,225,250);
    Label lab2 = new Label("Valor do carro em dólar", 250, 25, 5, 78);
    //Label lab3 = new Label("Prova 2", 150, 55, 50, 92);
    Label lab4 = new Label("Cotação", 150, 25, 100, 108);
    Label lab5 = new Label("Nome do carro", 150, 50, 75, 37);
    Input nam = new Input(200,20,182,52);
    Input in1 = new Input(200,20,182,82);
    Input in2 = new Input(200,20,182,112);
    //Input in3 = new Input(200,20,142,142); 
    Window win = new Window(650,450,"Atividade - 5");
    Label lab1 = new Label(" ",650,50,0,375);
    float cotacao;

    public Main(){
        win.getWindow().add(nam.getInput());
        win.getWindow().add(in1.getInput());
        win.getWindow().add(in2.getInput());
        //win.getWindow().add(in3.getInput());
        //win.getWindow().add(lab3.getLabel());
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
            float n2 = Float.parseFloat(in2.getInput().getText());
            String name = nam.getInput().getText();
            cotacao = n2;
            
            lab1.getLabel().setText(
                "Nome: "+ name + " | " +
                "Valor em Dólar: "+ n1 + " | "+
                "Valor em real: "+ n1 * cotacao+ " | " +
                "cotação: "+ cotacao + " | "
            );
        }
    }
}
