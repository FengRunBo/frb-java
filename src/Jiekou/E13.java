package Jiekou;
interface Animal{
	public abstract void shout();
}
class Dog implements Animal{
	public void shout() {
		System.out.println("����");
	}
}

public class E13 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}
}
//�ӿ���û�г�Ա����
//ֻ��public static final�ĳ�Ա����
//public static final�����ؼ��ֿ���ʡ��
//abstract����
//�ӿ��еķ�������public abstract
//public abstract�����ؼ��ֿ���ʡ��
	
