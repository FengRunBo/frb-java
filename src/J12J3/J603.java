package J12J3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Qiuhe_Thread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for (int i = 1; i < 11; i++) {
			sum+=i;
		}
		switch (Thread.currentThread().getName()) {
		case "线程1":
			
			break;

		case "线程2":
			sum+=10*10;
			break;
		}
		// TODO 自动生成的方法存根
		return sum;
	}
	
}
public class J603 {

	public static void main(String[] args) throws Exception, Exception {
		Qiuhe_Thread qh1=new Qiuhe_Thread();
		FutureTask<Object> ft1=new FutureTask<>(qh1);
		new Thread(ft1,"线程1").start();

		Qiuhe_Thread qh2=new Qiuhe_Thread();
		FutureTask<Object> ft2=new FutureTask<>(qh2);
		new Thread(ft2,"线程2").start();
		
		Qiuhe_Thread qh3=new Qiuhe_Thread();
		FutureTask<Object> ft3=new FutureTask<>(qh3);
		new Thread(ft3,"线程3").start();
		
		Qiuhe_Thread qh4=new Qiuhe_Thread();
		FutureTask<Object> ft4=new FutureTask<>(qh4);
		new Thread(ft4,"线程4").start();
		
		Qiuhe_Thread qh5=new Qiuhe_Thread();
		FutureTask<Object> ft5=new FutureTask<>(qh5);
		new Thread(ft5,"线程5").start();
		
		Qiuhe_Thread qh6=new Qiuhe_Thread();
		FutureTask<Object> ft6=new FutureTask<>(qh6);
		new Thread(ft6,"线程6").start();
		
		Qiuhe_Thread qh7=new Qiuhe_Thread();
		FutureTask<Object> ft7=new FutureTask<>(qh7);
		new Thread(ft7,"线程7").start();
		
		Qiuhe_Thread qh8=new Qiuhe_Thread();
		FutureTask<Object> ft8=new FutureTask<>(qh8);
		new Thread(ft8,"线程8").start();
		
		Qiuhe_Thread qh9=new Qiuhe_Thread();
		FutureTask<Object> ft9=new FutureTask<>(qh9);
		new Thread(ft9,"线程9").start();
		
		Qiuhe_Thread qh10=new Qiuhe_Thread();
		FutureTask<Object> ft10=new FutureTask<>(qh10);
		new Thread(ft10,"线程10").start();
		
		
		int he=(int)ft1.get()+(int)ft2.get()+(int)ft3.get()+(int)ft4.get()+(int)ft5.get()+(int)ft6.get()+(int)ft7.get()+(int)ft8.get()+(int)ft9.get()+(int)ft10.get();
		System.out.println(he);
	}

}
