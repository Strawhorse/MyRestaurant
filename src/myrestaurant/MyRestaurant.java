package myrestaurant;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
        setSize(600,500);
        
       Customer = new JLabel("Customer No: ");
       Customer.setBounds(20, 20, 120, 30);
       

        
    }
    
    


    public static void main(String[] args) {
        

        
        
        
    }
    
}
