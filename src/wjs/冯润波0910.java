package wjs;

import java.time.format.TextStyle;
import java.util.concurrent.SynchronousQueue;

public class ����0910 {
	public static void main(String[] args) {
		int j=1,i=1;
		System.out.println(++j);
		System.out.println(i++);
		System.out.println(--j);
		System.out.println(i--);
		i+=9;//�ȼ���i=i+9
		System.out.println(i);
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		����0910 t1=new ����0910();
		����0910 t2=new ����0910();
		System.out.println(t1==t2);
	}
}
