package J10J22;
import java.util.TreeSet;

public class E611 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet ts=new TreeSet<>();
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(21);
		System.out.println("创建的treeSet集合为："+ts);
		System.out.println("treeSet集合首元素为："+ts.first());
		System.out.println("treeSet集合尾部元素为："+ts.last());
		System.out.println("集合中小于或等于9的最大的一个元素为："+ts.floor(9));
		System.out.println("集合中大于10的最小的一个元素为："+ts.higher(10));
		System.out.println("集合中大于100的最小的一个元素为："+ts.higher(100));
		Object first=ts.pollFirst();
		System.out.println("删除的第一个元素："+first);
		System.out.println("删除第一个元素后treeSet集合为："+ts);
	}

}
