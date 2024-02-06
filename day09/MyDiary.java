package day09;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.*;

public class MyDiary extends JFrame {
		
	Container cp;
	
	String[] userInfo= {"root","123"};//아이디, 비밀번호
	
	private JTextField textField;//아이디
	private JPasswordField passwordField;//비밀번호
	
	public MyDiary() {	
		super(":::MyDiary v1.1:::");
		cp=this.getContentPane();//컨텐트 페인
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyDiary.class.getResource("/day08/diary2.PNG")));
		lblNewLabel.setBounds(12, 10, 360, 267);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 18));
		textField.setBounds(51, 305, 272, 48);
		panel.add(textField);
		textField.setColumns(10);
		textField.setBorder(new TitledBorder("아이디"));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.BOLD, 18));
		passwordField.setBounds(51, 374, 272, 48);
		panel.add(passwordField);
		passwordField.setBorder(new TitledBorder("비밀번호"));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//아이디,비번 입력값 얻기
				String id=textField.getText();
				//String pw=passwordField.getText();
				char[] ch=passwordField.getPassword();
				String pw=new String(ch);
				//유효성 체크
				if(id==null||ch==null||id.equals("")||pw.equals("")) {
					showMsg(panel,"아이디, 비밀번호를 입력해야 해요");
					return;
				}				
				//loginCheck(아이디,비밀번호)==>로그인 결과를 문자열로 반환==>대화창에 보여주기
				boolean isOk=loginCheck(id, pw);
				
				String result=(isOk)? id+"님 환영합니다. 일기장으로 이동합니다":"아이디 또는 비밀번호가 일치하지 않아요";
				showMsg(panel, result);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(MyDiary.class.getResource("/day08/login.PNG")));
		btnNewButton.setBounds(51, 443, 272, 53);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//reset처리
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MyDiary.class.getResource("/day08/reset.PNG")));
		btnNewButton_1.setBounds(51, 516, 272, 53);
		panel.add(btnNewButton_1);
		
		//창닫기 처리
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//System.exit(0)와 동일
	}//생성자-------------------
	
	public boolean loginCheck(String id, String pw) {
		//id가 killer로 들어오면 "Killer는 절대로 접속 불가!!" ==>NotSupportedNameException을 발생시키기
		
		//
		if(id.equals(userInfo[0]) && pw.equals(userInfo[1])) {
			return true;
		}
		return false;
	}//-----------------------------------
	
	public void showMsg(JPanel p, String msg) {
		JOptionPane.showMessageDialog(p, msg);
	}//------------------------

	public static void main(String[] args) {
		MyDiary my=new MyDiary();
		my.setSize(400,700);
		my.setVisible(true);

	}
}
