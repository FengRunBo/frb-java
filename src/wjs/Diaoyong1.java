package wjs;

import javax.xml.soap.Text;

public class Diaoyong1 {
	public Diaoyong1() {
		System.out.println("���췽��һ������");
	}
	public Diaoyong1(int x) {
		this();
		System.out.println("���췽����������");
	}
	public Diaoyong1(boolean b) {
		this(1);
		System.out.println("���췽����������");
	}
	public static void main (String[] args) {
		Diaoyong1 test =new Diaoyong1(true);
	}
}
