package lib;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener{
    private JFrame window;

    public JFrame getWindow(){
        return this.window;
    }
    
    public Window(int w,int h,String title){
        this.window = new JFrame();
        this.window.setLayout(null);
        this.window.setTitle(title);
        this.window.setSize(w,h);
        this.window.setLocationRelativeTo(null);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == javax.swing.JButton.class){
             System.out.println("Funcionou PORRA");
        }
       
    }    
}
