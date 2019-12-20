package J10J21;

import java.util.ArrayList;
import java.util.Iterator;

public class E603 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list=new  ArrayList<>();
		list.add("data1");
		list.add("data2");
		list.add("data3");
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.print(obj+"  ");
		}
		System.out.println();
		for(Object obj:list) {
			System.out.print(obj+"  ");
		}
		
	}

}
