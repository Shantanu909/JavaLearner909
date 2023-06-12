package GUI;
import javax.swing.*;
//import javax.swing.JFrame;
import java.awt.event.*;
import java.util.TimerTask;
import java.util.Timer;
public class Swing{
    public  Swing(){
        Timer timer = new Timer();
        System.out.println("Welcome to the program for swing implementation");
        JFrame f = new JFrame();
        
        JButton visible = new JButton("Visible");
        JButton invisible = new JButton("Invisible");
        
        visible.setBounds(60,40,70,100);
        invisible.setBounds(140,40,70,100);
        
        JTextField tf = new JTextField();
        tf.setBounds(100,250,70,100);
        
        visible.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("The end");
                /**for(float i =0;i<2097699.9999999999999999999999;i+=0.12)
                {
                    System.out.println(i);
                }**/
                //delay(5000);
                System.exit(0);
            }
        });
        invisible.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("not The end");
                
            }
        });
        f.add(visible);
        f.add(invisible);
        f.add(tf);
        f.setSize(800,500);
        f.setLayout(null);
        f.setVisible(true);
        
        
        
    }
    public static void main(String args[])
    {
        Swing obj = new Swing();
        System.out.println("TaDa");
        
    }
}