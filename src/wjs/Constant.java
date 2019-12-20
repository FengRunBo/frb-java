package wjs;

public class Constant {
	public static void main(String[] args) {
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		System.out.println("十六进制以0x开头"+0xc6);
		System.out.println("5.022e+6f="+5.022e+6f);
		System.out.println("5.022e+8="+5.022e+8);
		System.out.println("5.022e+8d="+5.022e+8d);
		System.out.println("我的名字"+'\u51af'+'\u6da6'+'\u6ce2');
		System.out.println("Wekcom,\nMonitor");
		System.out.println("布尔常量"+true+"或者"+false);
		System.out.println("引用数据类型常量"+null);
		int a=5;
		Constant constant=new Constant();
		constant=null;
		final int B=6;
		//B=7
	}
}
