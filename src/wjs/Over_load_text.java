package wjs;

public class Over_load_text {
	public static void main(String[] args) {
		System.out.println(E05.add(3,5));
		System.out.println(E05.add(3,5,6));
		E05 o1=new E05();
		System.out.println(E05.add(3.1,5.2));
	}
}
