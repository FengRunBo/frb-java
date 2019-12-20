package J12J13;

import java.net.*;
import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入聊天服务当前启动端口号：");
		int serverPort=sc.nextInt();
		System.out.println("请输入聊天服务发送信息对象的目标端口号：");
		int targetPort=sc.nextInt();
		System.out.println("聊天系统初始化完成并启动！！！");
		try {
			DatagramSocket socket=new DatagramSocket(serverPort);
			new Thread(new ChatReceiver(socket),"接收服务").start();
			new Thread(new ChatSend(socket,targetPort),"发送服务").start();
		} catch (SocketException e) {
			e.printStackTrace();
		}

	}

}
