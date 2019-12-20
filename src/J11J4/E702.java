package J11J4;

import java.io.*;

public class E702 {

	public static void main(String[] args) throws Exception  {
	FileOutputStream out=new FileOutputStream("d:\\out.txt");
	String str="hello";
	out.write(str.getBytes());
	out.close();
	}

}
