package J10J18;


import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;

public class J66ff {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Test text=new Test();
		ArrayList arrayList=new ArrayList<>();
		long kssj1=System.currentTimeMillis();
		text.listTest(arrayList);
		long jssj1=System.currentTimeMillis();
		System.out.println("��LinkedList����15���Ԫ�ػ���"+(jssj1-kssj1)+"����");
	}

}
class Test{
	public void listTest(List list) {
		for(int i=0;i<150000;i++) {
			list.add(0,i);
		}
	}
}