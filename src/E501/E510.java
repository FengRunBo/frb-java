package E501;

public class E510 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		long starTime=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<1000000000;i++) {
			sum+=i;
			
		}
		long endTime=System.currentTimeMillis();
		System.out.println("��������ʱ��Ϊ��"+(endTime-starTime)+"����");
	}

}
