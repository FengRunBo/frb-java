package J10J22;
import java.util.TreeSet;

public class E611 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet ts=new TreeSet<>();
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(21);
		System.out.println("������treeSet����Ϊ��"+ts);
		System.out.println("treeSet������Ԫ��Ϊ��"+ts.first());
		System.out.println("treeSet����β��Ԫ��Ϊ��"+ts.last());
		System.out.println("������С�ڻ����9������һ��Ԫ��Ϊ��"+ts.floor(9));
		System.out.println("�����д���10����С��һ��Ԫ��Ϊ��"+ts.higher(10));
		System.out.println("�����д���100����С��һ��Ԫ��Ϊ��"+ts.higher(100));
		Object first=ts.pollFirst();
		System.out.println("ɾ���ĵ�һ��Ԫ�أ�"+first);
		System.out.println("ɾ����һ��Ԫ�غ�treeSet����Ϊ��"+ts);
	}

}
