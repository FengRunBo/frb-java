package J10J18;

import java.util.ArrayList;
import java.util.LinkedList;

public class E61 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度："+list.size());
		System.out.println("第二个元素是"+list.get(1));
		
		LinkedList list2=new LinkedList();
		list.add("st1");
		list.add("st2");
		System.out.println(list2);
		list2.offer("offer");
		list2.push("push");
		System.out.println(list2);
		System.out.println("第一个元素是"+list2.get(0));
		System.out.println("第一个元素是"+list2.peek());
		list2.removeFirst();
		list2.pollLast();
		System.out.println(list2);
	}

}
