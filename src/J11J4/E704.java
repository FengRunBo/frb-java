package J11J4;

import java.io.*;


public class E704 {

	public static void main(String[] args) throws Exception{
		FileInputStream in=new FileInputStream("d:\\src.jpg");
		FileOutputStream out=new FileOutputStream("e:\\360Downloads.jpg");
		int len=0;
		long beginTime=System.currentTimeMillis();
		while ((len=in.read()) !=-1) {
			out.write(len);;
			
		}
		long endTime=System.currentTimeMillis();
		System.out.println("花费时间为："+(endTime-beginTime)+"毫秒");
		in.close();
		out.close();

	}

}
