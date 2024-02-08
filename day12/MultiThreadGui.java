package day12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MultiThreadGui extends JFrame {
	JButton btStart, btStop;	
	static JLabel lbCount, lbImage, lbClock;
	Thread trClock;
	ClockRunnable2 r1;
	CountThread trCount=null;
	ImageThread trImage=null;
	boolean isStop=false;

	public MultiThreadGui() throws HeadlessException {
		super("::MultiThreadGui::");
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		getContentPane().add(panel, BorderLayout.NORTH);
		
		btStart = new JButton("게임 시작");
		panel.add(btStart);
		
		btStop = new JButton("게임 중지");
		panel.add(btStop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		lbCount = new JLabel("카운트: ");
		lbCount.setFont(new Font("맑은 고딕", Font.BOLD, 26));
		lbCount.setBounds(68, 71, 199, 119);
		panel_1.add(lbCount);
		
		lbImage = new JLabel("");
		lbImage.setIcon(new ImageIcon(MultiThreadGui.class.getResource("/day12/images/T0.gif")));
		lbImage.setBounds(391, 61, 216, 144);
		panel_1.add(lbImage);
		
		lbClock = new JLabel("시간");
		lbClock.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lbClock.setBounds(126, 252, 426, 44);
		panel_1.add(lbClock);
		
		//btStart에 대한 이벤트 처리-Anonymous class로 처리해보자 =>inner class방식
		btStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isStop=false;
				panel_1.setBackground(Color.yellow);
				setTitle(e.getActionCommand()+" 누름");
				//카운트 스레드와 이미지 스레드를 동작
				if(trCount==null) {
					trCount=new CountThread();
					trCount.start();
				}//if
				if(trImage==null) {
					trImage=new ImageThread();
					trImage.start();
				}
				
			}
		});
		//setTimeout(function(){},1000)
		//btStop버튼에 대한 이벤트 처리
		btStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isStop=true;
				String cmd=e.getActionCommand();
				setTitle(cmd+" 누름");
				panel_1.setBackground(Color.orange);
				//카운트 스레드와 이미지 스레드를 중지
				if(trCount!=null) {
					//trCount.stop();//사용하지 말자
					trCount.interrupt();
					//스레드가 sleep(),join() 등 블럭됐을때
					//InterruptedException을 발생시킨다
					trCount=null;
				}
				if(trImage!=null) {
					trImage.interrupt();
					trImage=null;
				}
				
			}
		});
		
		//시계 스레드 생성해서 동작 시켜보기
		r1=new ClockRunnable2(this);
		trClock=new Thread(r1);
		trClock.start();
		
		
		setSize(700,400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자-------------------------
	//이미지 스레드
	class ImageThread extends Thread
	{
		public void run() {
			int i=0;
			while(!isStop) {
				if(i>9) {
					i=0;
				}
				//반복문 돌면서 T0.gif ~ T9.gif의 ImageIcon객체를 생성해서
				//lbImage.setIcon(이미지아이콘객체)
				ImageIcon icon=new ImageIcon("src/day12/images/T"+i+".gif");
				lbImage.setIcon(icon);
				i++;
				//sleep
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					System.out.println("이미지 스레드 예외: "+e.getMessage());
					break;
				}
			}//while----
		}//run()-------------
	}//inner class//////////////
	
	//카운트 스레드=>inner class
	static class CountThread extends Thread
	{
		static int count=500;
		
		public void run() {
			for(;count>=0;count--) {
				lbCount.setText("카운트: "+count);
				try {
					Thread.sleep(1000);//1초
				}catch(InterruptedException e) {
					System.out.println("예외: "+e.getMessage());
					return;
				}
			}
			JOptionPane.showMessageDialog(lbCount,"카운트 다운 완료! 게임 종료됐어요~");
		}//run()-----------
	}//inner class/////
	
	public static void main(String[] args) {
		new MultiThreadGui();
	}//main()----------------------------
}//class//////////////////////////////////