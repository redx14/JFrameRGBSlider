//Andrey Ilkiv
//Comp 271
//JSlider color change



package lab8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class slider extends JFrame{
    
    private JSlider red;
    private JSlider green;
    private JSlider blue;
    
    public slider(){
        
        
        JLabel r = new JLabel("Red");
        JLabel g = new JLabel("Green");
        JLabel b = new JLabel("Blue");
        final JLabel showcolors = new JLabel("Show colors");
        
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        showcolors.setHorizontalAlignment(JLabel.CENTER);
        showcolors.setVerticalAlignment(JLabel.CENTER);
        showcolors.setFont(new Font("IMPACT",20,50));
        
        panel2.setLayout(new BorderLayout());
        panel2.setBorder(new TitledBorder("Choose colors"));
        
        panel3.setLayout(new GridLayout(3,1));
        
        panel4.setLayout(new GridLayout(3,1));
        
                red = new JSlider(JSlider.HORIZONTAL);
                red.setValue(0);
		red.setMaximum(250);
		red.setMinimum(0);
		red.setPaintLabels(true);
		red.setMinorTickSpacing(10);
		red.setMajorTickSpacing(50);
		red.setPaintTicks(true);
                
                green = new JSlider(JSlider.HORIZONTAL);
                green.setValue(0);
		green.setMaximum(250);
		green.setMinimum(0);
		green.setPaintLabels(true);
		green.setMinorTickSpacing(10);
		green.setMajorTickSpacing(50);
		green.setPaintTicks(true);
                
                blue = new JSlider(JSlider.HORIZONTAL);
                blue.setValue(0);
		blue.setMaximum(250);
		blue.setMinimum(0);
		blue.setPaintLabels(true);
		blue.setMinorTickSpacing(5);
		blue.setMajorTickSpacing(50);
		blue.setPaintTicks(true);
        
                red.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int r = red.getValue();
                                int g = green.getValue();
                                int b = blue.getValue();
                                showcolors.setForeground(new Color(r,g,b));
			}
		});
                  green.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int r = red.getValue();
                                int g = green.getValue();
                                int b = blue.getValue();
                                showcolors.setForeground(new Color(r,g,b));
			}
		});
                    blue.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int r = red.getValue();
                                int g = green.getValue();
                                int b = blue.getValue();
                                showcolors.setForeground(new Color(r,g,b));
			}
		});
        add(panel1);
        
        panel1.setLayout(new BorderLayout());
        panel1.add(showcolors, BorderLayout.CENTER);
        panel1.add(panel2, BorderLayout.SOUTH);
        
        panel2.add(panel3, BorderLayout.WEST);
        panel2.add(panel4, BorderLayout.CENTER);
        
        panel3.add(r);
        panel3.add(g);
        panel3.add(b);
        
        panel4.add(red);
        panel4.add(green);
        panel4.add(blue);
        
        
    }
    
}
