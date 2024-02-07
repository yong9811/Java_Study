package day11;
import java.util.*;

public class ClockRunnable implements Runnable{
	public void run() {
		while(true) {
		Date now=new Date();
		System.out.println(now);
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("예외: "+ e.getMessage());
			}
		}
	}
}
