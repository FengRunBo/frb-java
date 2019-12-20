package J12J16;

import java.io.*;
import java.net.*;

public class P407 {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtijz=new ServerSocket(8899);
		while (true) {
			Socket khdtjz=fwqtijz.accept();
			Thread thread=new Thread(()->{
				try {
					String ip=khdtjz.getInetAddress().getHostAddress();
					int port=khdtjz.getPort();
					System.out.println("与客户端为"+port+"的客户端链接成功!");
					InputStream is;
					is=khdtjz.getInputStream();
					File wj=new File("d:\\upload\\"+ip+".jpg");
					FileOutputStream fout=new FileOutputStream(wj);
					byte[] zjhc=new byte[1024];
					int b=is.read(zjhc);
					while (b!=-1) {
						fout.write(zjhc,0,b);
						b=is.read(zjhc);
					}
					OutputStream os;
					os=khdtjz.getOutputStream();
					String s=ip+"上传了";
					zjhc=s.getBytes();
					
					os.write(zjhc);
					Thread.sleep(5000);
					
					os.close();
					khdtjz.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			thread.start();
		}

	}

}
