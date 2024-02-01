package day07;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
public class Test {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		JButton btnNewButton = new JButton("New button");
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("New button");
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Test.class.getResource("/day07/a.jpg")));
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		f.setVisible(true);
	}

}
