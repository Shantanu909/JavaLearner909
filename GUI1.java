package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class GUI1{
     GUI1(){
       JFrame guiFrame1= new JFrame();
       guiFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       guiFrame1.setTitle("First GUI");
       guiFrame1.setSize(300,250);
       guiFrame1.setLocationRelativeTo(null);

        String[] fruitOptions = {"Apple", "Apricot", "Banana"
                ,"Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"};

        //Options for the JList
        String[] vegOptions = {"Asparagus", "Beans", "Broccoli", "Cabbage"
                , "Carrot", "Celery", "Cucumber", "Leek", "Mushroom"
                , "Pepper", "Radish", "Shallot", "Spinach", "Swede"
                , "Turnip"};


       //fruits
       final JPanel comboPanel= new JPanel();
       JLabel comboLbl= new JLabel("Fruits");
       JComboBox fruits = new JComboBox(fruitOptions);
       comboPanel.add(comboLbl);
       comboPanel.add(fruits);

       //veg
       final JPanel listPanel= new JPanel();
       listPanel.setVisible(false);
       JLabel listLbl1= new JLabel("Vegetables:");
       JList vegs= new JList (vegOptions);
       vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);

       listPanel.add(listLbl1);
       listPanel.add(vegs);

       //button 
       JButton vegFruitBut = new JButton("Fruit or Veg");

       vegFruitBut.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent event)
           {
               listPanel.setVisible(!listPanel.isVisible());
               comboPanel.setVisible(!comboPanel.isVisible());
           }
           
        });

       guiFrame1.add(comboPanel, BorderLayout.NORTH);
       guiFrame1.add(listPanel, BorderLayout.CENTER);
       guiFrame1.add(vegFruitBut,BorderLayout.SOUTH);
       guiFrame1.setVisible(true);


        }

    public static void main(String args[]){
        GUI1 s= new GUI1();

    }
}