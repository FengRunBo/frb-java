package J12J3;
class MyThread extends Thread{
	public MyThread(String name) { 
		super(name);
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run()����������");
		}
	}
}
public class J3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MyThread t1=new MyThread("�ֳ�1");
		t1.start();
		MyThread t2=new MyThread("�߳�2");
		t2.start();
	}

}
