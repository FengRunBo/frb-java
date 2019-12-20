package J12J10;

import java.net.*;

public class P396 {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(3000);
		String str="hello world";
		DatagramPacket packet=new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("localhost"),8900);
		System.out.println("开始发送信息。。。");
		client.send(packet);
		client.close();

	}

}
