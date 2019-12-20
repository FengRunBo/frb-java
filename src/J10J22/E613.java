package J10J22;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=(String) obj1;
		String s2=(String) obj2;
		int temp=s1.length()-s2.length();
		return temp;
	}
}

public class E613 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet ts=new TreeSet(new MyComparator());
		ts.add("jack");
		ts.add("helena");
		ts.add("eve");
		System.out.println(ts);
		TreeSet ts2=new TreeSet((obj1,obj2)->{
			String s1=(String) obj1;
			String s2=(String) obj2;
			return s1.length()-s2.length();
		});
		//如果使用Tree默认的比较器插入字符串，则会使用字符串类的CompareTo方法
				//按照英文字母或者数字的顺序进行排序插入集合
				//如果使用自定义的比较器Mycomparator插入字符串，则会使用自定义的比较器类的Compare方法
				//按照字符长度的顺序进行排序插入集合，如果长度相同，则TreeSet认为是同一个元素，无法插入
		ts2.add("jack");
		ts2.add("helena");
		ts2.add("eve");
		System.out.println(ts2);
	}

}
