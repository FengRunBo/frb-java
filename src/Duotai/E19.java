package Duotai;
class Wai{
	static int m=1;
	void test1() {
		System.out.println("外部类成员方法");
	}
	void test2() {
		class Nei{
			int n=2;
			void show() {
				System.out.println("外部变量m="+m);
				test1();
			}
		}
		Nei nei=new Nei();
		System.out.println("局部内部类变量n="+nei.n);
		nei.show();
	}
	static class Nei{
		void show() {
			System.out.println("外部变量m="+m);
		}
	}
}
public class E19 {

	public static void main(String[] args) {
		Wai wai=new Wai();
		wai.test2();

		Wai.Nei i=new Wai.Nei();
		i.show();
	}

}
