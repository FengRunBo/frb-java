package wjs;

import org.omg.CORBA.BAD_POLICY_TYPE;

public class 冯润波0909 {
	public static void main(String[] args) {
		//自动类型转换
		byte b=3;
		int i=b;
		System.out.println("整型变量i的值是"+i);
		int i2=3;
		byte b2=(byte)i2;
		System.out.println("整型变量b2的值是"+b2);
	}
}
