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
		System.out.println("�ֽ����������ݵĳ���"+Byte.SIZE);
		System.out.println("�������������ݵĳ���"+Short.SIZE);
		System.out.println("�������ݵĳ���"+Integer.SIZE);
		System.out.println("���������ݵĳ���"+Long.SIZE);
		System.out.println("�����ȸ��������ݵĳ���"+Float.SIZE);
		System.out.println("˫���ȸ��������ݵĳ���"+Double.SIZE);
		System.out.println("�ַ������ݵĳ���"+Character.SIZE);

		System.out.println("�ֽ����������ݵ�ȡֵ��Χ"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("�������������ݵ�ȡֵ��Χ"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("�������ݵ�ȡֵ��Χ"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("�������������ݵ�ȡֵ��Χ"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		System.out.println("�����ȸ����͵�ȡֵ��Χ"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("˫���ȸ��������ݵ�ȡֵ��Χ"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("�ַ������ݵ�ȡֵ��Χ��"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);

	}
}
