package J12J13;

import java.net.*;



public class J1 {

	public static void main(String[] args) throws Exception {
		DatagramSocket server=new DatagramSocket(8900);
		byte[] buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf,buf.length);
		System.out.println("�ȴ��������ݡ���");
		while (true) {
			server.receive(packet);
			String str=new String(packet.getData(),0,packet.getLength());
			System.out.println(packet.getAddress()+":"+packet.getPort()+"������Ϣ��"+str);
		}
	}

}
