package J10J21;

import java.util.ArrayList;
import java.util.Iterator;

public class E608 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list=new  ArrayList<>();
		list.add("data1");
		list.add("data2");
		list.add("data3");
		System.out.println(list);
		Iterator it=list.iterator();
		it.forEachRemaining(obj->System.out.println("��������Ԫ�أ�"+obj));
	}

}
