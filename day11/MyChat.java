package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
/*[실습]
 * - 입력 버튼에 대한 이벤트 처리=> ActionEvent
 * - 버튼을 누르면 tf에 입력한 값을 가져와서
 *   ta에 붙여주고
 * - tf는 다시 비워주기
 * - ta에는 그동안 입력한 내용을 모두 볼 수 있도록 처리하세요   
 * */

public class MyChat extends JFrame implements ActionListener{

	Container cp;
	private JTextField tf;
	private JTextArea ta;
	private JButton bt;
	
	
	public MyChat() {
		super("MyChat");
		cp=this.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 360, 510);
		panel.add(scrollPane);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		ta.setBorder(new LineBorder(Color.blue,3));
		ta.setFont(new Font("sans-serif",Font.BOLD,18));
		ta.setEditable(false);//읽기전용
		
		tf = new JTextField();
		tf.setBounds(12, 530, 360, 49);
		panel.add(tf);
		tf.setColumns(10);
		tf.setFont(new Font("sans-serif",Font.BOLD,18));
		tf.setBorder(new TitledBorder("Message"));
		
		bt = new JButton("입   력");
		bt.setBounds(12, 589, 360, 32);
		panel.add(bt);
		bt.setMnemonic('M');
		
		bt.addActionListener(this);
		tf.addActionListener(this);
		
		this.setSize(400,670);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String input=tf.getText();
//		ta.setText(ta.getText()+input+"\n");
		ta.append(input+"\n");
		tf.setText("");
		tf.requestFocus();
	}
	
	public static void main(String[] args) {
		new MyChat();
	}

	
}
