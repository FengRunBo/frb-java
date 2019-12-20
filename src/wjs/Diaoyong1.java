package wjs;

import javax.xml.soap.Text;

public class Diaoyong1 {
	public Diaoyong1() {
		System.out.println("构造方法一被调用");
	}
	public Diaoyong1(int x) {
		this();
		System.out.println("构造方法二被调用");
	}
	public Diaoyong1(boolean b) {
		this(1);
		System.out.println("构造方法三被调用");
	}
	public static void main (String[] args) {
		Diaoyong1 test =new Diaoyong1(true);
	}
}
