package myrestaurant;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author new
 */
public class MyRestaurant {


    public static void main(String[] args) {
        
//        Create inital frame for app
        JFrame frame = new JFrame("My Restaurant");
        JLabel label = new JLabel("My restaurant");
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        frame.add(label);
        

        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        
        
    }
    
}
