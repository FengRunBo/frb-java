package J12J3;

class MyThread_ implements Runnable{
	
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run()����������");
		}
	}
}
public class J03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MyThread_ mt1=new MyThread_();
		Thread t1=new Thread(mt1,"�߳�1");
		t1.start();
		MyThread_ mt2=new MyThread_();
		Thread t2=new Thread(mt2,"�߳�2");
		t2.start();
	}

}
