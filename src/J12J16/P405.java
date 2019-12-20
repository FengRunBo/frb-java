package J12J16;

import java.io.*;
import java.net.*;
public class P405 {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket=new ServerSocket(8899);
		while (true) {
			Socket client=serverSocket.accept();
			System.out.println("与客户端连接成功，开始进行数据交互！");
			OutputStream os=client.getOutputStream();
			String s="你好客户端，来自10.2.103.31这个服务器的问候";
			byte[] b=s.getBytes();
			os.write(b);
		}
	}

}
