package J12J13;

import java.net.*;
import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������������ǰ�����˿ںţ�");
		int serverPort=sc.nextInt();
		System.out.println("�����������������Ϣ�����Ŀ��˿ںţ�");
		int targetPort=sc.nextInt();
		System.out.println("����ϵͳ��ʼ����ɲ�����������");
		try {
			DatagramSocket socket=new DatagramSocket(serverPort);
			new Thread(new ChatReceiver(socket),"���շ���").start();
			new Thread(new ChatSend(socket,targetPort),"���ͷ���").start();
		} catch (SocketException e) {
			e.printStackTrace();
		}

	}

}
