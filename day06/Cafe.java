package day06;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm=new CoffeeMachine();
		cm.setCoffee(1);
		cm.setSugar((short) 2);
		cm.setCream(3.5f);
		
		System.out.println("cm.coffee: "+cm.getCoffee());
		System.out.println("cm.sugar: "+cm.getSugar());
		System.out.println("cm.cream: "+cm.getCream());
	}

}
