package J10J15;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class E518 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int num=123;
		String string=String.valueOf(num);
		System.out.println("��int����ת��Ϊ�ַ����Ľ����"+string);
		String str="998";
		Integer integer=Integer.valueOf(num);
		Integer integer2=Integer.valueOf(str);
		System.out.println("��int����ת��Ϊ��װ��Ľ����"+integer);
		System.out.println("���ַ�������ת��Ϊ��װ��Ľ����"+integer2);
		Integer integer3=new Integer(num);
		Integer integer4=new Integer(str);
		System.out.println("ͨ����������int����ת��Ϊ��װ��Ľ����"+integer3);
		System.out.println("ͨ�����������ַ�������ת��Ϊ��װ��Ľ����"+integer4);
		int parseInt=Integer.parseInt(str);
		System.out.println("���ַ�����Ϊ�������͵Ľ����"+parseInt);
		String string2=integer.toString();
		System.out.println("����װ��ת��Ϊ�ַ����Ľ����"+string2);
		
		
	}

}
