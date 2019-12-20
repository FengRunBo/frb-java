package Jicheng;
abstract class Gfdgh{
	public abstract void shout();
}
class Cat extends Gfdgh{
	public void shout() {
		System.out.println("ÍúÍú");
	}
}

public class E12 {
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.shout();
	}
}
