package J12J3;
class TicketWindow extends Thread{
	private int tickets=100;
	public void run() {
		
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
			}
			
		}
	}
}
public class J0003 {

	public static void main(String[] args) {
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();

	}

}
