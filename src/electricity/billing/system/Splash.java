
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Splash extends JFrame implements Runnable{
    
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);

        setVisible(true);
        int x =1;
        for(int i = 1; i<= 600; i+=4,x+=1)
        {
            
            setSize(i+x, i);
            setLocation(700 -((i+x)/2),400-(i/2));
        
            try{Thread.sleep(5);}
            catch(Exception e){e.printStackTrace();}
        
        }
        Thread t = new Thread(this);
        t.start();
        setVisible(true);
    }
    
//    override run 
     public void run(){
         try{Thread.sleep(2000); setVisible(false); new Login();}
         catch(Exception e){e.printStackTrace();}
     }
    
    public static void main(String str[]){
        Splash sb = new Splash();

    }
    
}
