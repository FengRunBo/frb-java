package J10J15;

import java.util.Random;

public class Ssq {
	
	public static void main(String[] args) throws IncompatibleClassChangeError, InterruptedException{
		// TODO 自动生成的方法存根
		System.out.println("双色球的开奖结果：");
		System.out.println("六个红色球的号码：");
		Random r=new Random();
		int hq;
		for(int i=0;i<6;i++) {
			hq=r.nextInt(33)+1;
			System.out.println(hq+" ");
			Thread .sleep(1000);
		}
		System.out.println();
		System.out.println("篮球号码是：");
		Random r1=new Random();
		int lq;
		for(int i=0;i<1;i++) {
			hq=r.nextInt(33)+1;
			System.out.println(hq+" ");
			Thread .sleep(1000);
		
	}

	}
}
