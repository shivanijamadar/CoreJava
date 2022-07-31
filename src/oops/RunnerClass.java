package oops;

public class RunnerClass {

	public static void main(String[] args) {
		
		Employee E1 = new Employee();

		
		E1.Name = "Bob";
		E1.EmpId = 123;
		E1.Dept = "HR";
		E1.Display();
		
		Employee E2 = new Employee("Pop", 456, "Finance");
		E2.Display();
		
		Bank B = new Bank();
		
		B.AccountBalance();
		
		int result = B.getBalance();
		System.out.println(result);
		
		BOABank B1 = new BOABank();
		
		B1.CCBalance();
		B1.AccountBalance();
		
		OverloadingExample overload = new OverloadingExample();
		
		int tArea = overload.getArea(3, 4);
		System.out.println("Area of rectangle:" + tArea);
		
		int sArea = overload.getArea(3);
		System.out.println("Area of rectangle:" + sArea);

		//Overriding
		
		//ABSTRACTION
		
		Chrome ch = new Chrome();		
		ch.openBrowser();
		
		Browser bro = new Chrome();		
		bro.openBrowser();
		
			//Interface
		HondaCar honda = new HondaCar();
		CarInterface ci = new HondaCar();
		
		honda.start();
		ci.stop();
		
		//Encapsulation
		
		Encapsulation en = new Encapsulation();
		en.setBalance(3000);
		System.out.println("GetBalance "+ en.getBalance());
		
	}

}
