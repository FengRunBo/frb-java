package J11J4;

import java.io.*;

public class E701 {

	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("d:\\test.txt");
		int b=0;
		while((b=in.read()) !=-1) {
			System.out.println(b);
		}
		in.close();
	}

}
