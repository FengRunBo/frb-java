package J10J21;

import java.util.ArrayList;
import java.util.Iterator;

public class E606 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list=new  ArrayList<>();
		list.add("Jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			if ("Annie".equals(obj)) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}
