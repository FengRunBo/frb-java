package J10J21;

import java.util.ArrayList;

public class E607 {

	public static void main(String[] args) {
		ArrayList<String> list=new  ArrayList<String>();
		list.add("data1");
		list.add("data2");
		list.add("data3");
		System.out.println(list);
		list.forEach(obj->System.out.println("迭代集合元素："+obj));
		

	}

}
