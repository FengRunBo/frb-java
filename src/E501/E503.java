package E501;

public class E503 {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str="���˲�ja1va5qw5qw7qw2qw8qw7qw3qw7qw5qw9";
		char[] charArray=str.toCharArray();
		System.out.print("���ַ���תΪ�ַ�����ı��������");
		for(int i=0;i<charArray.length;i++) {
			if(i !=charArray.length-1) {
				System.out.print(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("�ַ����е������ǣ�");
		for(char zf:charArray) {
			if (zf>='0'&&zf<='9') {
			    System.out.print(zf);
			}
		}
		System.out.println();
		System.out.print("�ַ����еĺ����ǣ�");
		for(char zf:charArray) {
			if (zf>='\u4E00'&&zf<='\u9FA5') {
			    System.out.print(zf);
			}
		}
		System.out.println();
		System.out.println("��intֵת��ΪString����֮��Ľ����"+String.valueOf(12));
		System.out.println("���ַ���ת���ɴ�д֮��Ľ����"+str.toUpperCase());
	}

}
