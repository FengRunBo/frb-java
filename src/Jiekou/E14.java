package Jiekou;
interface HHH{
	int ID=1;
	void breathe();
	default void getType(String type) {
		System.out.println("该动物属于"+type);
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
		System.out.println("狗仔呼吸");	
	}
	public void run() {
		System.out.println("狗刨");
	}
}
public class E14{
	public static void main(String[] args) {
		System.out.println("HHH.getID");
		Dog1 dog1=new Dog1();
		System.out.println(dog1.ID);
		dog1.breathe();
		dog1.getType("犬科");
		dog1.run();
	}
}
