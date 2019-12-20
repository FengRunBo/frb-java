package J10J25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class E615 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map=new HashMap();
		map.put("1","jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		map.put("4","Lucy");
		map.put("1","Tom");
		System.out.println(map);
		
		if (map.containsKey("1")) {
			System.out.println("双列集合hm包含键1");
			System.out.println("双列集合hm键1的值是"+map.get("1"));
		}
		System.out.println("键对象集合是"+map.keySet());
		System.out.println("值对象集合是"+map.keySet());
		map.replace("1","Mary");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);
		
	}

}
