package E501;

public class E506 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String string="2018-01-24";
		System.out.println("从第六个字符截取到末尾的结果："+string.substring(5));
		System.out.println("从第六个字符截取到第七个字符的结果："+string.substring(5,7));
		System.out.println("分割后的字符串组中的元素依次为：");
		String[] strArray=string.split("-");
		for(int i=0;i<strArray.length;i++) {
			if(i !=strArray.length-1) {
				System.out.println(strArray[i]+"、");
			}
		}
	}

}
