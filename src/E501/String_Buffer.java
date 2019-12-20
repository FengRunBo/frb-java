package E501;

public class String_Buffer {
	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1.equals(s2));
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		System.out.println(s1.equals(sb2));
		
		String s11="a";
		String s12="b";
		String s13=s11+s12;
		System.out.println(s13);
		StringBuffer sb11=new StringBuffer("a");
		StringBuffer sb12=new StringBuffer("b");
		;
	}
	
}
