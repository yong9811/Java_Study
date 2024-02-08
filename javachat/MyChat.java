package javachat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.net.*;
import java.io.*;

public class MyChat extends JFrame implements ActionListener,Runnable{

	Container cp;
	private JTextField tf;
	private JTextArea ta;
	private JButton bt;
	private String nickName="noname";
	
	private Socket sock;
	private BufferedReader in;
	private PrintWriter out;
	
	public MyChat() {
		super("MyChat");
		
		cp=this.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 360, 502);
		panel.add(scrollPane);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		ta.setBorder(new LineBorder(Color.blue,3));
		ta.setFont(new Font("sans-serif",Font.BOLD,18));
		ta.setEditable(false);//편집하지 못하도록=>읽기 전용
		
		tf = new JTextField();
		tf.setBounds(12, 522, 360, 52);
		panel.add(tf);
		tf.setColumns(10);
		tf.setFont(new Font("sans-serif",Font.BOLD,18));
		tf.setBorder(new TitledBorder("Message"));
		
		bt = new JButton("입    력");
		bt.setBounds(12, 584, 360, 35);
		panel.add(bt);
		bt.setMnemonic('M');//단축키 설정 Alt+M
		
		//리스너 부착
		bt.addActionListener(this);
		tf.addActionListener(this);//엔터 칠때 ActionEvent가 발생함
		
		nickName=JOptionPane.showInputDialog("닉네임을 입력하세요");
		if(nickName!=null) {
			setTitle(nickName+"님 대화창");
			//챗서버에 접속
			connectChat();
		}
		
		this.setSize(400,665);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-------------------------
	
	public void connectChat() {
		try {
			sock=new Socket("localhost",9999);
			ta.append("##챗서버에 연결됨###\n");
			in=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out=new PrintWriter(sock.getOutputStream(),true);
			out.println(nickName);//서버에 나의 닉네임을 보내자
			//서버의 메시지를 듣는 스레드 동작
			Thread listener=new Thread(this);
			listener.start();
		} catch (Exception e) {
			ta.setText("채팅 서버 연결 실패\n"+e+"\n");
		}
	}//-------------------------------
	
	public void run() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String input=tf.getText();
		//ta.setText(ta.getText()+input+"\n");
		//ta.append(input+"\n");
		
		//서버에 입력한 내용 보내기
		
		
		tf.setText("");
		tf.requestFocus();
	}//-----------------------

	public static void main(String[] args) {
		new MyChat();
	}
}

