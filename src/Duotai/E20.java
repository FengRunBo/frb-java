package Duotai;
interface HaHa{
	void shout();
}
public class E20 {

	public static void main(String[] args) {
		String name="Ц��";
		Cat cat=new Cat();
		cat.shout();
		animalshout(new Animal() {
			@Override
			public void shout() {
				// TODO �Զ����ɵķ������
				System.out.println("�����ڲ������"+name+"����");
			}
		});
		animalshout(()->System.out.println("Lambda���ʽ���:"+name+"����"));
	}
	public static void animalshout(Animal animal) {
		animal.shout();
	}
}
