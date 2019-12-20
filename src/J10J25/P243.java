package J10J25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


	public class P243 {

		public static void main(String[] args) {
			// TODO 自动生成的方法存根
			Map map=new TreeMap(new CustomComparator());
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
		}
	}
