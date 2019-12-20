package Duotai;
interface Animal{
	void shout();
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵喵");
	}
	public void CatchMouse() {
		System.out.println("猫捉老夫");
	}
}
class Dog implements Animal{
	@Override
	public void shout() {
		System.out.println("汪汪汪");
	}
}
public class E14 {
	public static void main(String[] args) {
		Animal an1=new Cat();
		an1.shout();
		Animal an2=new Dog();
		an2.shout();
		if (an1 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.CatchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}
		
		if (an2 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.CatchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}
	}
}
