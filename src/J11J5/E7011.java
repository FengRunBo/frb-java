package J11J5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class E7011 {

	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("d:\\fufu.txt");
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream out=new FileOutputStream("d:\\luanxiang.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(osw);
		String line=null;
		while ((line=br.readLine()) !=null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();

	}

}
