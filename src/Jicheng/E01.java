package Jicheng;

class Dong {
	String name;
	void shout() {
		System.out.println("���﷢������");
	}
	public Dong(String name) {
		System.out.println("����"+name);
	}
}
class Dog extends Dong{
	public Dog() {
		super("���˲�");
	}
	public void printName() {
		System.out.println("name="+name);
	}
	@Override
	void shout() {
		super.shout();
		System.out.println("������������������");
	}
}
public class E01{
	public static  void main(String[] args) {
		Dog dog=new Dog();
		/*dog.name="�л���԰Ȯ";
		dog.printName();
		dog.shout();*/
	}
}