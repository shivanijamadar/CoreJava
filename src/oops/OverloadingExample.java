package oops;

public class OverloadingExample {
	public int getArea(int l, int b) {
		return l*b;
	}
	
	public int getArea(int l) {
		return l*l;
	}
	
	public float getArea(float l) {
		return l*l;
	}
}
