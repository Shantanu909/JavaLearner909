package GUI;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Practice{
public Practice()
{
    JFrame f1 =  new JFrame();
    JButton pass = new JButton();
    JButton fail = new JButton();
    
    pass.setBounds(50,50,50,50);
    fail.setBounds(50,50,50,50);
    f1.add(pass);
    f1.add(fail);
    f1.setSize(500,500);
    f1.setVisible(true);
    f1.setLayout(null);
    
}
    public static void main(String args[])
{
    Practice s = new Practice();
    
}
}