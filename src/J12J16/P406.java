package J12J16;

import java.io.*;
import java.net.*;

public class P406 {

	public static void main(String[] args) throws Exception{
		
		Socket client=new Socket("10.2.103.203",8899);
		File wj=new File("d:\\冯润波.jpg");
		FileInputStream fin=new FileInputStream(wj);
		OutputStream os;
		os=client.getOutputStream();
		byte[] buf=new byte[1024];
		int len=fin.read(buf);
		while (len!=-1) {
			os.write(buf,0,len);
			len=fin.read(buf);
		}
		client.shutdownOutput();
		InputStream is=client.getInputStream();
		buf=new byte[1024];
		len=is.read(buf);
		while (len!=1) {
			System.out.println(new String(buf,0,len));
			len=is.read(buf);
		}
		is.close();
		client.close();
	}

}
