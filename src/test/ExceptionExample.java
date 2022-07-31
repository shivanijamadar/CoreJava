package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,6};
		

		try{
			System.out.println(array[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught");
		}
		finally{
			System.out.println("Always executed");
		}
	}

}
