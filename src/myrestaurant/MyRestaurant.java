package myrestaurant;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author new
 */
public class MyRestaurant extends JFrame{
    
    JLabel Customer, Name, Contact;
    JTextField tfNumber, tfName, tfContact;
    
    

    public MyRestaurant() throws HeadlessException {
    
        //        Create inital frame for app
       setTitle("My Restaurant");
//        setMinimumSize(minimumSize);
       setSize(600,500);
       setLayout(null);
                
//       set initial labels
       Customer = new JLabel("Customer No: ");
       Customer.setBounds(20, 20, 120, 30);
       
       Name = new JLabel("Customer Name: ");
       Name.setBounds(20, 50, 120, 30);
       
       Contact = new JLabel("Customer Contact: ");
       Contact.setBounds(20, 80, 120, 30);
       
       getContentPane().add(Customer);
       getContentPane().add(Name);
       getContentPane().add(Contact);

       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    


    public static void main(String[] args) {
        
        new MyRestaurant();
        
        
    }
    
}
