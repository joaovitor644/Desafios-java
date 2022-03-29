package lib;
import javax.swing.JFrame;


public class Window {
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
}
