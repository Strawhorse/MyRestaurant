package myrestaurant;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class MyRestaurant extends JFrame{
    
    JLabel Customer, Name, Contact, Foods, Drinks, Type;
    JTextField tfNumber, tfName, tfContact;
    JButton reset, print, receipt;
    JComboBox cb1, cb2;
    JRadioButton radio1, radio2;
    JTextArea area1, area2;
    

    public MyRestaurant() {
    
        //        Create inital frame for app
       setTitle("My Restaurant");
//        setMinimumSize(minimumSize);
       setSize(900,500);
       setLayout(null);
                
//       set initial labels
       Customer = new JLabel("Customer No: ");
       Customer.setBounds(20, 20, 120, 30);
       tfNumber = new JTextField();
       tfNumber.setBounds(150, 20, 300, 30);
       
       Name = new JLabel("Customer Name: ");
       Name.setBounds(20, 80, 120, 30);
       tfName = new JTextField();
       tfName.setBounds(150, 80, 300, 30);
       
       Contact = new JLabel("Customer Contact: ");
       Contact.setBounds(20, 140, 120, 30);
       tfContact = new JTextField();
       tfContact.setBounds(150, 140, 300, 30);
       
       
//       Now add the food and drink buttons with lists
       Foods = new JLabel("Foods: ");
       Foods.setBounds(20, 200, 120, 30);
       String[] foods = {"Pizza", "Burger", "Lasagna", "Bolognese", "Curry"}; 
       cb1 = new JComboBox(foods);
       cb1.setBounds(150, 200, 120, 30);
       
       Drinks = new JLabel("Drinks: ");
       Drinks.setBounds(20, 260, 120, 30);
       String[] drinks = {"Coke", "7-Up", "Sprite", "Orange", "Fanta"};
       cb2 = new JComboBox(drinks);
       cb2.setBounds(150, 260, 120, 30);
       
      
       Type = new JLabel("Type: ");
       Type.setBounds(20, 320, 120, 30);
       radio1 = new JRadioButton("Vegetarian");
       radio1.setBounds(150, 320, 100, 30);
       radio2 = new JRadioButton("Standard");
       radio2.setBounds(300, 320, 100, 30);
       
//       create a button group to hold the variable for the buttons
       ButtonGroup group = new ButtonGroup();
       group.add(radio1);
       group.add(radio2);
       
       
       
//       add buttons for functionality
        reset = new JButton("Reset");
        reset.setBounds(500,20,80,30);
       
        print = new JButton("Print");
        print.setBounds(600,20,80,30);
        
        receipt = new JButton("Receipt");
        receipt.setBounds(700,20,80,30);
        
        area1 = new JTextArea("Details of meal: \n");
        area1.setBounds(500, 60, 280, 200);
        
       
//       add all the content panes; can be done quicker by adding them all to a panel and then adding the panel to the frame
       getContentPane().add(Customer);
       getContentPane().add(Name);
       getContentPane().add(Contact);
       getContentPane().add(tfNumber);
       getContentPane().add(tfContact);
       getContentPane().add(tfName);
       getContentPane().add(Foods);
       getContentPane().add(Drinks);
       getContentPane().add(Type);
       getContentPane().add(reset);
       getContentPane().add(receipt);
       getContentPane().add(print);
       getContentPane().add(area1);
       getContentPane().add(cb1);
       getContentPane().add(cb2);
       getContentPane().add(radio1);
       getContentPane().add(radio2);

       
//       add event handling for buttons
       reset.addActionListener((ActionEvent e) -> {
           tfContact.setText("");
           tfName.setText("");
           tfNumber.setText("");
           area1.setText("Details of meal: \n");
       });
       
//       Initial way to do this action method
//       reset.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               tfContact.setText("");
//               tfName.setText("");
//               tfNumber.setText("");
//           }
//       });

        print.addActionListener((ActionEvent e) -> {
           try {
               area1.print();
           } catch (PrinterException ex) {
               Logger.getLogger(MyRestaurant.class.getName()).log(Level.SEVERE, "Something happened", ex);
           }
        });
       
       
       
        receipt.addActionListener((ActionEvent e) -> {
           area1.setText("Receipt details: \n");
           area1.setText(area1.getText()+ "Customer number: " + 
                   tfNumber.getText() + "\nCustomer Name: " + 
                   tfName.getText() + "\nCustomer Contact: " + 
                   tfContact.getText());
        });
        
       
       
//       Create visibility and turn on/off at exit
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    


    public static void main(String[] args) {
        
        new MyRestaurant();
        
        
    }
    
}
