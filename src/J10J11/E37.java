package J10J11;
class Person{
	public void finalize(){
		System.out.println("���󽫱���Ϊ�������ա�����");
	}
}
public class E37{
	public static void recycleWaste1(){
		Person p1=new Person();
		p1=null;
		int i=1;
		while(i<10){
		System.out.println("����1ѭ���С�����");
		i++;
		}
	}
public static void recycleWaste2(){
	Person p2=new Person();
	p2=null;
	System.gc();
	int i=1;
	while(i<10){
	System.out.println("����2ѭ���С�����");
	i++;
	}
}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		recycleWaste1();
		recycleWaste2();
	}

}
