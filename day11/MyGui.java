package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyGui extends JFrame implements ActionListener{
	Container cp;
	JPanel panel, northP;
	JButton btR,btG,btB;
	public MyGui() {
		super("::MyGui::");
		cp=this.getContentPane();
		panel=new JPanel();
		cp.add(panel, "Center");
		panel.setBackground(Color.WHITE);
		
		northP=new JPanel();
		cp.add(northP, "North");
		northP.setBackground(Color.magenta);
		
		btR=new JButton("Red");
		btG=new JButton("Green");
		btB=new JButton("Blue");
		
		northP.add(btR);
		northP.add(btG);
		northP.add(btB);
		
		btR.addActionListener(this); //this==> 이벤트핸들러객체(ActionListener를 구현한 객체)
		btG.addActionListener(this);
		btB.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		String cmd=e.getActionCommand();
		setTitle(cmd+"버튼을 눌렀군요~");
		if(obj==btR) {
			panel.setBackground(Color.red);
		}else if(obj==btG) {
			panel.setBackground(Color.green);
		}else if(obj==btB) {
			panel.setBackground(Color.blue);
		}
		
	}
	
	public static void main(String[] args) {
		MyGui my=new MyGui();
//		my.setSize(400,700);
		my.setBounds(1300,50,400,700);
		my.setVisible(true);
	}

}
