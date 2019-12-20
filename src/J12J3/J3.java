package J12J3;
class MyThread extends Thread{
	public MyThread(String name) { 
		super(name);
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class J3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyThread t1=new MyThread("现成1");
		t1.start();
		MyThread t2=new MyThread("线程2");
		t2.start();
	}

}
