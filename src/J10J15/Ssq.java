package J10J15;

import java.util.Random;

public class Ssq {
	
	public static void main(String[] args) throws IncompatibleClassChangeError, InterruptedException{
		// TODO �Զ����ɵķ������
		System.out.println("˫ɫ��Ŀ��������");
		System.out.println("������ɫ��ĺ��룺");
		Random r=new Random();
		int hq;
		for(int i=0;i<6;i++) {
			hq=r.nextInt(33)+1;
			System.out.println(hq+" ");
			Thread .sleep(1000);
		}
		System.out.println();
		System.out.println("��������ǣ�");
		Random r1=new Random();
		int lq;
		for(int i=0;i<1;i++) {
			hq=r.nextInt(33)+1;
			System.out.println(hq+" ");
			Thread .sleep(1000);
		
	}

	}
}
