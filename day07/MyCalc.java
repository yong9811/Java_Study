package day07;
import java.awt.Container;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MyCalc extends JFrame{
	
	Container cp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	//기본생성자 구성
	public MyCalc() {
		cp=this.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MyCalc.class.getResource("/day07/pngwing.com (3).png")));
		lblNewLabel.setBounds(0, 0, 484, 185);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(35, 203, 119, 61);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자 2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(35, 272, 119, 61);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(166, 210, 229, 51);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 279, 229, 51);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(textField_1, "더하기 버튼을 눌렀군요");
				//숫자1 입력박스에 입력한 값 얻어오기
				String str1=textField.getText();
				setTitle("숫자1: "+str1);
				//숫자2 입력박스에 입력한 값 얻어오기
				//숫자1+숫자2 더한 값을 결과 입력박스에 넣어준다
			}
		});
		btnNewButton.setBounds(95, 426, 144, 93);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("지우기");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBounds(251, 426, 144, 93);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("결  과");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(35, 341, 119, 61);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(166, 348, 229, 51);
		panel.add(textField_2);
	}
	
	public static void main(String[] args) {
		MyCalc my=new MyCalc();
		my.setSize(500,600);
		my.setVisible(true);
	}
}
