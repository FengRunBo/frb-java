package wjs;

import java.io.Serializable;
//������
//���η�+class+������ʾ��+extends���̳йؼ��֣� �����ʾ��+impements
//��һ�����η���ʾ���÷�Χ��piblic���е�  proteted�ܱ�����  prinate˽�е�
//�ڶ������η���ʾ�ض����ܣ�static��̬�� final���յģ�����û�����ࣩsynchronizedͬ����


public class lei extends Object implements Serializable{
	//�ĸ��ڲ���
	public final static class A extends Object implements Serializable{	}
	private final static class B extends Object implements Serializable{	}
	
	protected final static class C extends Object implements Serializable{	}
	protected final static class D extends Object implements Serializable{	}
	//����������Ա����:���η�+������������������+������ʾ��
	private final static String name="";
	private final static int age=0;
	//����������Ա����
	//����������Ա���������η�+�������ص�ֵ����������+������������ֵ������  ��������{}
	//������ǰ���������η�����ʡ�ԣ�,������ǰ����з���ֵ���ͣ�����ʡ�ԣ�
	//����ֵ����Ϊvoid��ʾ�գ��������ڲ���Ҫreturn���
	//�������͵ķ���ֵ,�������ڶ���Ҫreturn���
	//�����������ȸ�һ��С���ţ��ڸ�һ��������
	//�����������һ��С����������԰������� ����ʽ�ǣ���������  ������
	private static final void setAge(int nianling) {
		
	}
	public int getAge() {
		return age;
	}
}
//private default protected public:�ɷ�������С���󣬲�������������class
//������������ĳ�Ա����Field����ĳ�Ա����Method
//pricate����ɼ�default�����ɼ���protected������ɼ���public��������
