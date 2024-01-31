package day06;

public class Overloading {

	public static void main(String[] args) {
		VendingMachine vm=new VendingMachine();
		vm.makeTea(1, 2, 3);
		System.out.println("vm.coffee: "+vm.coffee);
		System.out.println("vm.sugar: "+vm.sugar);
		System.out.println("vm.cream: "+vm.cream);
		System.out.println("*************************");
		vm.makeTea(1,2);
		String str=vm.makeTea(1);
		System.out.println(str);
		vm.makeTea(1, (short)1);
		vm.makeTea((short)1,2);

		Yuja tea=new Yuja();
		tea.setYuja(6);
		tea.setSugar(6);
		vm.makeTea(tea);
		
	}

}
