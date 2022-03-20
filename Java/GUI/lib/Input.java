package lib;

import javax.swing.JTextField;

public class Input {
    private JTextField input;
    public Input(int width,int height,int x, int y){
        this.input = new JTextField();
        this.input.setBounds(x, y, width, height);
        //this.input.setPreferredSize(new DimensionUIResource(200, 40));
    }
    public JTextField getInput(){
        return this.input;
    }
}
