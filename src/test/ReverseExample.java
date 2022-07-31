package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String str = 	"Clean World Green World";
		String result = "";
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
			char ch = str.charAt(i);
			result = result + ch;
		}
		System.out.println("Result Sting is: "+result);
	*/
		int num = 235;
		int res = 0;
		while(num>0) {
			int rem = num%10; //4
			res = res*10 + rem; //987654
			num = num/10;  //0	
		}
		System.out.println("The resulted num is " + res);
	}	
}
