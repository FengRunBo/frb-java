package J12J13;

import java.net.*;

public class J2 {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(3000);
		String str="���Է벨���ʺ�";
		byte[] hcqsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,InetAddress.getByName("10.2.103.203"),8900);
		System.out.println("��ʼ���͡�����");
		client.send(packet);
		client.close();
	}

}
