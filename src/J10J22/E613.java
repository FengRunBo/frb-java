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
		// TODO �Զ����ɵķ������
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
		//���ʹ��TreeĬ�ϵıȽ��������ַ��������ʹ���ַ������CompareTo����
				//����Ӣ����ĸ�������ֵ�˳�����������뼯��
				//���ʹ���Զ���ıȽ���Mycomparator�����ַ��������ʹ���Զ���ıȽ������Compare����
				//�����ַ����ȵ�˳�����������뼯�ϣ����������ͬ����TreeSet��Ϊ��ͬһ��Ԫ�أ��޷�����
		ts2.add("jack");
		ts2.add("helena");
		ts2.add("eve");
		System.out.println(ts2);
	}

}
