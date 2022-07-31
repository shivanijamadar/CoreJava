package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 5, 6,7}; 
		int length = array1.length;
		
		System.out.println(array1[1]);
		System.out.println("Get last element: " +array1[length-1]);
		
		String[] str = {"ABC", "XYZ", "PQR"};
		int arrLenth = str.length;
		System.out.println("Get last String: "+ str[arrLenth-1]);
		
		String str1 = "Seen Clean Green";
		String[] str2 = str1.split(" ");
		
		System.out.println(str2[str2.length -1]);
		
		
	}

}
