package E501;

public class E510 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long starTime=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<1000000000;i++) {
			sum+=i;
			
		}
		long endTime=System.currentTimeMillis();
		System.out.println("程序运行时间为："+(endTime-starTime)+"毫秒");
	}

}
