package J12J3;

class TicketWindow6 implements Runnable{
	private int tickets=80;
	public void run() {
		
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"学习笔记");
			}
			
		}
	}
}
public class P387 {

	public static void main(String[] args) {
		TicketWindow6 tw=new TicketWindow6();
		new Thread(tw,"第一位老师").start();
		new Thread(tw,"第二位老师").start();
		new Thread(tw,"第三位老师").start();
	}

}
