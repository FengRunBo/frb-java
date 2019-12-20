package wjs;

import org.omg.CORBA.BAD_POLICY_TYPE;

/**
 * @author Administrator
 *
 */

public class Wsp {
	/**
	 * @author Administrator
	 *
	 */
	public static void main(String[] args) {
		byte b=1;
		short s=1;
		int i=1;
		long l=1;
		float f=1.0f;
		double d=1.0;
		char c='a';
		short sc=97;
		char cc=97;
		System.out.println(c);
		System.out.println((char)sc);
		System.out.println(cc);
		System.out.println("字节型整型数据的长度"+Byte.SIZE);
		System.out.println("短整型整型数据的长度"+Short.SIZE);
		System.out.println("整型数据的长度"+Integer.SIZE);
		System.out.println("长整型数据的长度"+Long.SIZE);
		System.out.println("单精度浮点型数据的长度"+Float.SIZE);
		System.out.println("双精度浮点型数据的长度"+Double.SIZE);
		System.out.println("字符型数据的长度"+Character.SIZE);

		System.out.println("字节型整型数据的取值范围"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整型数据的取值范围"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型数据的取值范围"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整型数据的取值范围"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		System.out.println("单精度浮点型的取值范围"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("双精度浮点型数据的取值范围"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("字符型数据的取值范围是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);

	}
}
