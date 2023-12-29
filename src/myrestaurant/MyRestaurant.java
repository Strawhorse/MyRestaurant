package myrestaurant;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author new
 */
public class MyRestaurant {


    public static void main(String[] args) {
        
//        Create inital frame for app
        JFrame frame = new JFrame("My Restaurant");
        JLabel label = new JLabel("My restaurant");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        frame.add(panel);
        

        frame.setSize(300,200);
        frame.setVisible(true);
        
        
        
        
    }
    
}
