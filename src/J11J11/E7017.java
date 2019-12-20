package J11J11;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class E7017 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile raf=new RandomAccessFile("times.txt","rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if (times>0) {
			System.out.println("您还可以试用："+times+"次！");
			raf.seek(0);
			raf.write((times+"").getBytes());
			
		}else {
			System.out.println("使用次数已用完");
		}
		raf.close();
	}

}
