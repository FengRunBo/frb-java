package Duotai;
class Wai{
	static int m=1;
	void test1() {
		System.out.println("�ⲿ���Ա����");
	}
	void test2() {
		class Nei{
			int n=2;
			void show() {
				System.out.println("�ⲿ����m="+m);
				test1();
			}
		}
		Nei nei=new Nei();
		System.out.println("�ֲ��ڲ������n="+nei.n);
		nei.show();
	}
	static class Nei{
		void show() {
			System.out.println("�ⲿ����m="+m);
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
