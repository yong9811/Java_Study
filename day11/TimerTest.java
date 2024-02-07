package day11;

import java.util.*;
class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println(">>게임이 종료되었습니다<<");
	}
	
}

public class TimerTest {

	public static void main(String[] args) {
		Timer timer=new Timer();
		System.out.println("현재 게임이 진행되고 있어요... 5초 뒤에는 게임이 종료됩니다");
		
		MyTask task=new MyTask();
//		timer.schedule(task,5000);
		timer.scheduleAtFixedRate(task, 5000, 10000);
	}

}
