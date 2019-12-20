package J11J5;

import java.io.*;

public class E709 {

	public static void main(String[] args) throws Exception{
		FileReader fileReader=new FileReader("d:\\fufu.txt");
		FileWriter fileWriter=new FileWriter("d:\\luanxiang.txt");
		int len=0;
		char[] buff=new char[1024];
		while ((len=fileReader.read(buff)) !=-1) {
			fileWriter.write(buff,0,len);
			
		}
		fileReader.close();
		fileWriter.close();
	}

}
