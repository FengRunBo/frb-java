package J12J10;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.naming.spi.DirStateFactory.Result;

public class P84 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Integer>completableFuture1=CompletableFuture.supplyAsync(()->{
			int sum=0,i=0;
			while (i++<5) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"�߳���������ִ��...i:"+i);
			}
			return sum;
		});
		CompletableFuture<Integer>completableFuture2=CompletableFuture.supplyAsync(()->{
			int sum=0,j=5;
			while (j++<10) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"�߳���������ִ��...j:"+j);
			}
			return sum;
		});
		CompletableFuture<Integer>completableFuture3=completableFuture1.thenCombine(completableFuture2, (result1,result2)->result1+result2);
		System.out.println("1��10��ӵĽ��Ϊ��"+completableFuture3.get());

	}

}
