package lib;
import javax.swing.JButton;

public class Button{
	
	public JButton btm = new JButton();

	public Button(String lab,int wid,int hei,int x,int y){
		btm.setBounds(x,y,wid,hei);
		btm.setText(lab);
	}
	
	
}