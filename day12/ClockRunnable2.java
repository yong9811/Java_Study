package day12;
import java.util.*;

import javax.swing.JLabel;
public class ClockRunnable2 implements Runnable{
	
	private MultiThreadGui remote;
	public ClockRunnable2(MultiThreadGui gui) {
		remote=gui;
	}


	@Override
	public void run() {
		while (true) {
			Calendar cal=Calendar.getInstance();
			
			String str="";
			int yy=cal.get(Calendar.YEAR);
			str+=yy+"-";
			
			int month=cal.get(Calendar.MONTH)+1;
			str+=(month<10)?"0"+month+"-":month+"-";
			
			int dd=cal.get(Calendar.DAY_OF_MONTH);
			str+=(dd<10)?"0"+dd+" ":dd+" ";
			
			int am_pm=cal.get(Calendar.AM_PM);
			str+=(am_pm==Calendar.AM)?"AM ":"PM ";
			
			int hh=cal.get(Calendar.HOUR_OF_DAY);
			int mm=cal.get(Calendar.MINUTE);
			int ss=cal.get(Calendar.SECOND);
			str+=hh+":";
			str+=(mm<10)?"0"+mm+":": mm+":";
			str+=(ss<10)?"0"+ss: ss;
			remote.lbClock=setText(str);
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}


	private JLabel setText(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
