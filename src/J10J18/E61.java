package J10J18;

import java.util.ArrayList;
import java.util.LinkedList;

public class E61 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("���ϵĳ��ȣ�"+list.size());
		System.out.println("�ڶ���Ԫ����"+list.get(1));
		
		LinkedList list2=new LinkedList();
		list.add("st1");
		list.add("st2");
		System.out.println(list2);
		list2.offer("offer");
		list2.push("push");
		System.out.println(list2);
		System.out.println("��һ��Ԫ����"+list2.get(0));
		System.out.println("��һ��Ԫ����"+list2.peek());
		list2.removeFirst();
		list2.pollLast();
		System.out.println(list2);
	}

}
