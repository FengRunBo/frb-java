package J11J11;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class E7017 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO �Զ����ɵķ������
		RandomAccessFile raf=new RandomAccessFile("times.txt","rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if (times>0) {
			System.out.println("�����������ã�"+times+"�Σ�");
			raf.seek(0);
			raf.write((times+"").getBytes());
			
		}else {
			System.out.println("ʹ�ô���������");
		}
		raf.close();
	}

}
