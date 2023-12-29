package myrestaurant;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author new
 */
public class MyRestaurant extends JFrame{
    
    JLabel Customer, Name, Contact, Foods, Drinks, Type;
    JTextField tfNumber, tfName, tfContact;
    JButton reset, print, receipt;
    

    public MyRestaurant() throws HeadlessException {
    
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
       
       
//       Now add the food and drink buttons
       Foods = new JLabel("Foods: ");
       Foods.setBounds(20, 200, 120, 30);
       
       Drinks = new JLabel("Foods: ");
       Drinks.setBounds(20, 260, 120, 30);
       
       Type = new JLabel("Foods: ");
       Type.setBounds(20, 320, 120, 30);
       
       
//       add buttons
        reset = new JButton("Reset");
        reset.setBounds(500,20,80,30);
       
        print = new JButton("Print");
        print.setBounds(600,20,80,30);
        
        receipt = new JButton("Receipt");
        receipt.setBounds(700,20,80,30);
        
       
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

       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    


    public static void main(String[] args) {
        
        new MyRestaurant();
        
        
    }
    
}
