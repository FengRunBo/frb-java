package J12J3;

class TicketWindow6 implements Runnable{
	private int tickets=80;
	public void run() {
		
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"���ڷ��۵�"+tickets--+"ѧϰ�ʼ�");
			}
			
		}
	}
}
public class P387 {

	public static void main(String[] args) {
		TicketWindow6 tw=new TicketWindow6();
		new Thread(tw,"��һλ��ʦ").start();
		new Thread(tw,"�ڶ�λ��ʦ").start();
		new Thread(tw,"����λ��ʦ").start();
	}

}
