package J11J5;

import java.io.*;

public class E7010 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("d:\\fufu.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\luanxiang.txt"));
		String str=null;
		while ((str=br.readLine()) !=null){
			bw.write(str);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	
}
