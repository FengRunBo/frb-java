package Jicheng;
/*class Animal{
	void shout() {
		System.out.println("�����");
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
		return"����һֻ�ϴ�";
	}
}
class Dg extends Animal{
	public String toString() {
		return"����һֻ������";
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
