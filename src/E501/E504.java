package E501;

public class E504 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="  http :// localhost : 8080  ";
		System.out.println("去除字符串两端空格后的结果："+s.trim());
		System.out.println("去除字符串所有空格后的结果："+s.replace(" ",""));
		System.out.println("去除字符串所有空格后的结果："+s.replaceAll("\\s+",""));
	}

}
