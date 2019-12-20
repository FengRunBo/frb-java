package J12J3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread__ implements Callable<Object>{
	
	public Object call() {
		int i=0;
		while (i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
		return i;
	}
}
public class J003 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO 自动生成的方法存根
		MyThread__ mt1=new MyThread__();
		FutureTask<Object>ft1=new FutureTask<Object>(mt1);
		Thread t1=new Thread(ft1,"线程1");
		t1.start();
		MyThread__ mt2=new MyThread__();
		FutureTask<Object>ft2=new FutureTask<Object>(mt2);
		Thread t2=new Thread(ft2,"线程2");
		t2.start();
		System.out.println("thread1返回结果："+ft1.get());
		System.out.println("thread2返回结果："+ft2.get());
	}

}
