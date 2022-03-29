package lib;

import javax.swing.*;

public class NInput{
    private SpinnerModel ninput;
    private JSpinner spinner1;
    public NInput(int min,int max,int step,int w,int h,int x, int y ){
        ninput = new SpinnerNumberModel(0,min,max,step);
        spinner1 = new JSpinner(ninput);
        spinner1.setBounds(w,h,x,y);
    }
    public JSpinner getNInput(){
        return this.spinner1;
    }
}