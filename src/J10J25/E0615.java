package J10J25;

import java.util.*;


public class E0615 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map=new HashMap();
		map.put("1","jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		while (it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		
		
		
		Map map2=new HashMap();
		map.put("1","jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		Set entrySet=map.entrySet();
		Iterator it2=entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry entry=(Map.Entry) (it2.next());
			Object key2=entry.getKey();
			Object value2=entry.getValue();
			System.out.println(key2+":"+value2);
		}
		System.out.println("foreach遍历集合输出");
		map.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println("foreach遍历值输出");
		Collection zhiji=map.values();
		zhiji.forEach(zhi->System.out.println(zhi));
	}

}
