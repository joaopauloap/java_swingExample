package swingExample;

import java.awt.event.*;
import javax.swing.*;

public class SwingExample1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Swing Example 1");
		
		JLabel l = new JLabel("This is a label");
		l.setBounds(50,30,150,20);
		f.add(l);
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		f.add(tf);
		
		JButton b = new JButton("Click Here");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("You clicked the button");
			}
		});
		f.add(b);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}