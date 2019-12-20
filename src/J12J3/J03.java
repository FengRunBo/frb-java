package J12J3;

class MyThread_ implements Runnable{
	
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class J03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyThread_ mt1=new MyThread_();
		Thread t1=new Thread(mt1,"线程1");
		t1.start();
		MyThread_ mt2=new MyThread_();
		Thread t2=new Thread(mt2,"线程2");
		t2.start();
	}

}
