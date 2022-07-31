package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num = 13;
		boolean flag = true;
		for(int i=2;i<num;i++) {
			int rem = num%i;
			if(rem == 0) {
				System.out.println("Number is not Prime");
				flag = false;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("Number is Prime");
		}

	}

}
