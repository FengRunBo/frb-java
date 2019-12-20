package Jicheng;
/*class Animal{
	void shout() {
		System.out.println("动物叫");
	}
}
public class E06 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		System.out.println(animal.toString());
	}
}*/
class Animal{
	public String toString() {
		return"这是一只老崔";
	}
}
class Dg extends Animal{
	public String toString() {
		return"这是一只老王饭";
	}
}
public class E06 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dg lwf=new Dg();
		System.out.println(animal.toString());
		System.out.println(lwf.toString());
	}
}
