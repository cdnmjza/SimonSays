import java.awt.Color;//use for adding color to setBackground, setForeground etc...

import javax.swing.*;

/*import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

When I want to implement sound to SimonSays use these imports
*/

public class SimonSays {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Simon Says");
		
		JButton b = new JButton("RED");
		JButton b1 = new JButton("YELLOW");
		JButton b2 = new JButton("BLUE");
		JButton b3= new JButton("GREEN");

		
		b.setBounds(-3, -5, 200, 200);//red
		b1.setBounds(197, -5, 203, 200);//yellow
		b2.setBounds(-3, 195, 200, 200);//blue
		b3.setBounds(197, 195, 203, 200);//green
		
		//Red Button
		b.setBackground(Color.red);
		b.setOpaque(true);
		b.setFocusPainted(false);
		b.setBorderPainted(false);
		
		//yellow Button
		b1.setBackground(Color.yellow);
		b1.setOpaque(true);
		b1.setFocusPainted(false);
		b1.setBorderPainted(false);
		
		//blue button
		b2.setBackground(Color.blue);
		b2.setOpaque(true);
		b2.setFocusPainted(false);
		b2.setBorderPainted(false);
		
		//green button
		b3.setBackground(Color.green);
		b3.setOpaque(true);
		b3.setFocusPainted(false);
		b3.setBorderPainted(false);
		
		//Frame options
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		

	}
	
	
}
