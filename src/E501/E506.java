package E501;

public class E506 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String string="2018-01-24";
		System.out.println("�ӵ������ַ���ȡ��ĩβ�Ľ����"+string.substring(5));
		System.out.println("�ӵ������ַ���ȡ�����߸��ַ��Ľ����"+string.substring(5,7));
		System.out.println("�ָ����ַ������е�Ԫ������Ϊ��");
		String[] strArray=string.split("-");
		for(int i=0;i<strArray.length;i++) {
			if(i !=strArray.length-1) {
				System.out.println(strArray[i]+"��");
			}
		}
	}

}
