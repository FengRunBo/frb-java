package J11J5;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class E707 {

	public static void main(String[] args) throws Exception {
		FileReader fileReader=new FileReader("d:\\fufu.txt");
		int len=0;
		while((len=fileReader.read())!=-1) {
			System.out.println((char)len);
		}
		fileReader.close();
	}

}
