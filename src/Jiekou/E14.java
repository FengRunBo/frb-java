package Jiekou;
interface HHH{
	int ID=1;
	void breathe();
	default void getType(String type) {
		System.out.println("�ö�������"+type);
	}
static int getID(){
	return HHH.ID;
	}
}
interface LandHHH extends HHH{
	void run();
}
class Dog1 implements LandHHH{
	public void breathe() {
		System.out.println("���к���");	
	}
	public void run() {
		System.out.println("����");
	}
}
public class E14{
	public static void main(String[] args) {
		System.out.println("HHH.getID");
		Dog1 dog1=new Dog1();
		System.out.println(dog1.ID);
		dog1.breathe();
		dog1.getType("Ȯ��");
		dog1.run();
	}
}
