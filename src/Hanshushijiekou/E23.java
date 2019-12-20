package Hanshushijiekou;
@FunctionalInterface
interface An1{
	void shout();
}
@FunctionalInterface
interface An2{
	int sum(int x,int y);
}


public class E23 {

	public static void main(String[] args) {
		animalShout(()->System.out.println("无参、无返回值的函数式借口调用"));
		showSum(10,20,(x,y)->x+y);

	}
	
		
	private static void animalShout(An1 An1) {
		An1.shout();
		
	}


	private static void showSum(int x,int y,An2 An2) {
		System.out.println(x+"+"+y+"的和为"+An2.sum(x,y));
		
	}

}
