package Hanshushijiekou;
@FunctionalInterface
interface Calacable{
	int calc(int num);
}
class Math{
	public static int abs(int num) {
		if (num<0) {
			return-num;
		}else {
			return num;
		}
	}
}
public class E24 {
	private static void printAbs(int num,Calacable ca) {
		System.out.println(ca.calc(num));
	}
	public static void main(String[] args) {
		printAbs(-10,(n)->Math.abs(n));
		printAbs(-10,Math::abs);

	}

}
