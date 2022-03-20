package lib;
import javax.swing.JLabel;

public class Label {
    private JLabel label;

    public Label(String lab ,int width,int height,int x,int y){
        this.label = new JLabel();
        this.label.setText(lab);
        this.label.setBounds(x, y, width, height);
    }
    public JLabel getLabel(){
        return this.label;
    }
    public void setText(String text){
        this.label.setText(text);
    }
}
