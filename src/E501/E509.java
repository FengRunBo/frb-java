package E501;

import java.util.*;

public class E509 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Properties properties=System.getProperties();
		System.out.println(properties);
		Set<String>propertyNames=properties.stringPropertyNames();
		for(String key:propertyNames) {
			String value=System.getProperty(key);
			System.out.println(key+"---"+value);
		}
	}

}
