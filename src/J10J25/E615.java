package J10J25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class E615 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map map=new HashMap();
		map.put("1","jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		map.put("4","Lucy");
		map.put("1","Tom");
		System.out.println(map);
		
		if (map.containsKey("1")) {
			System.out.println("˫�м���hm������1");
			System.out.println("˫�м���hm��1��ֵ��"+map.get("1"));
		}
		System.out.println("�����󼯺���"+map.keySet());
		System.out.println("ֵ���󼯺���"+map.keySet());
		map.replace("1","Mary");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);
		
	}

}
