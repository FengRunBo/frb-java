package E501;

public class E504 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s="  http :// localhost : 8080  ";
		System.out.println("ȥ���ַ������˿ո��Ľ����"+s.trim());
		System.out.println("ȥ���ַ������пո��Ľ����"+s.replace(" ",""));
		System.out.println("ȥ���ַ������пո��Ľ����"+s.replaceAll("\\s+",""));
	}

}
