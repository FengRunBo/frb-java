package wjs;

public class Fenbo {
	public static int F(int n) {
		if(n==1) return 1;
		if(n==2) return 1;
		
		return F(n-1)+F(n-2);
	}
	public static void main(String[] args) {
		System.out.println("Fiboncci sequence�ĵ�6������"+F(6));

	}

}
