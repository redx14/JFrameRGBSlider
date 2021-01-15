
package lab8;
import javax.swing.JFrame;
public class Lab8 {
    public static void main(String[] args) {
   	slider gui = new slider();
		gui.setTitle("SliderExample");
		gui.setSize(500,300);
		gui.setLocationRelativeTo(null); //center on screen
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		gui.setVisible(true); //show it
	}
    
}
