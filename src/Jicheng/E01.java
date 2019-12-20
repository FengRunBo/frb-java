package Jicheng;

class Dong {
	String name;
	void shout() {
		System.out.println("动物发出叫声");
	}
	public Dong(String name) {
		System.out.println("我是"+name);
	}
}
class Dog extends Dong{
	public Dog() {
		super("烦人不");
	}
	public void printName() {
		System.out.println("name="+name);
	}
	@Override
	void shout() {
		super.shout();
		System.out.println("汪汪。。。。。。。");
	}
}
public class E01{
	public static  void main(String[] args) {
		Dog dog=new Dog();
		/*dog.name="中华田园犬";
		dog.printName();
		dog.shout();*/
	}
}