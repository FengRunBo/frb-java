package J12J10;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class P390 {

	public static void main(String[] args) throws Exception {
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");
		System.out.println("������IP��ַ��"+localAddress.getHostAddress());
		System.out.println("itcast��IP��ַ��"+remoteAddress.getHostAddress());
		System.out.println("3�����Ƿ���Է��ʣ�"+remoteAddress.isReachable(3000));
		System.out.println("itcast��������Ϊ��"+remoteAddress.getHostAddress());
	}

}
