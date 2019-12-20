package J10J25;
import java.util.*;
class CustomComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String key1=(String) obj1;
		String key2=(String) obj2;
		return key2.compareTo(key1);
	}
}
public class E619E620 {
	public static void main(String[] args) {
		Map map=new TreeMap();
		map.put("2","jack");
		map.put("1","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		Map map1=new TreeMap(new CustomComparator());
		map1.put("2","jack");
		map1.put("1","Rose");
		map1.put("3","Lucy");
		System.out.println(map1);
	}
}
