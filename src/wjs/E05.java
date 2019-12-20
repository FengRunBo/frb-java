package wjs;

public class E05 {
		//两个整数的加法
	public static int add(int x,int y) {
		return x+y;
	}
	//三个整数的加法
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	//两个浮点数的加法
	public static double add(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(add(3,5,6));
		System.out.println(add(3.1,5.2));
	}
}
