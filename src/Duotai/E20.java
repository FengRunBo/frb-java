package Duotai;
interface HaHa{
	void shout();
}
public class E20 {

	public static void main(String[] args) {
		String name="笑话";
		Cat cat=new Cat();
		cat.shout();
		animalshout(new Animal() {
			@Override
			public void shout() {
				// TODO 自动生成的方法存根
				System.out.println("匿名内部类输出"+name+"喵喵");
			}
		});
		animalshout(()->System.out.println("Lambda表达式输出:"+name+"喵喵"));
	}
	public static void animalshout(Animal animal) {
		animal.shout();
	}
}
