package day11;
import java.util.*;
public class ClockRunnable2 implements Runnable{

	@Override
	public void run() {
		while (true) {
			Calendar cal=Calendar.getInstance();
			int am_pm=cal.get(Calendar.AM_PM);
			String str=(am_pm==Calendar.AM)?"AM ":"PM ";
			
			int hh=cal.get(Calendar.HOUR_OF_DAY);
			int mm=cal.get(Calendar.MINUTE);
			int ss=cal.get(Calendar.SECOND);
			str+=hh+":";
			str+=(mm<10)?"0"+mm+":": mm+":";
			str+=(ss<10)?"0"+ss: ss;
			System.out.println(str);
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
}
