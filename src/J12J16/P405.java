package J12J16;

import java.io.*;
import java.net.*;
public class P405 {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket=new ServerSocket(8899);
		while (true) {
			Socket client=serverSocket.accept();
			System.out.println("��ͻ������ӳɹ�����ʼ�������ݽ�����");
			OutputStream os=client.getOutputStream();
			String s="��ÿͻ��ˣ�����10.2.103.31������������ʺ�";
			byte[] b=s.getBytes();
			os.write(b);
		}
	}

}
