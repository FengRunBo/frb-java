package J11J11;

import java.nio.CharBuffer;

import javax.naming.LimitExceededException;

public class E7018 {

	public static void main(String[] args) {
		CharBuffer charBuffer=CharBuffer.allocate(6);
		System.out.println("������"+charBuffer.capacity());
		System.out.println("����ֵ��"+charBuffer.limit());
		System.out.println("��ʼλ�ã�"+charBuffer.position());
		charBuffer.put('x');
		charBuffer.put('z');
		charBuffer.put('y');
		System.out.println("����Ԫ�غ�� ����ֵ��"+charBuffer.limit());
		System.out.println("����Ԫ�غ��λ�ã�"+charBuffer.position());
		charBuffer.flip();
		System.out.println("ִ��flip������Ľ���ֵ��"+charBuffer.limit());
		System.out.println("ִ��flip�������λ�ã�"+charBuffer.position());
		System.out.println("ȡ���ĵ�һ��Ԫ��Ϊ��"+charBuffer.get());
		System.out.println("ȡ����Ľ���ֵ��"+charBuffer.limit());
		System.out.println("ȡ�����λ�ã�"+charBuffer.position());
		charBuffer.clear();
		System.out.println("ִ��clear������Ľ���ֵ��"+charBuffer.limit());
		System.out.println("ִ��clear�������λ�ã�"+charBuffer.position());
		System.out.println("ȡ���ĵ�һ��Ԫ��Ϊ��"+charBuffer.get(0));
		System.out.println("ȡ����Ľ���ֵ��"+charBuffer.limit());
		System.out.println("ȡ�����λ�ã�"+charBuffer.position());
	}

}
