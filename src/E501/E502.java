package E501;

public class E502 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s="abcabcbacdba.txt";
		System.out.println("�ַ����ĳ��ȣ�"+s.length());
		System.out.println("�ַ����е�һ���ַ���"+s.charAt(0));
		System.out.println("�ַ�c��һ�γ��ֵ�λ�ã�"+s.indexOf('c'));
		System.out.println("�ַ�c���һ�γ��ֵ�λ�ã�"+s.lastIndexOf('c'));
		System.out.println("���ַ�����һ�γ��ֵ�λ�ã�"+s.indexOf("ab"));
		System.out.println("���ַ������һ�γ��ֵ�λ�ã�"+s.lastIndexOf("ab"));
		System.out.println("�Ƿ���.txt��β��"+s.endsWith(".txt"));
	}

}
