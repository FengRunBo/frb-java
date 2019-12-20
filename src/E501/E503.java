package E501;

public class E503 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str="烦人不ja1va5qw5qw7qw2qw8qw7qw3qw7qw5qw9";
		char[] charArray=str.toCharArray();
		System.out.print("将字符串转为字符数组的遍历结果：");
		for(int i=0;i<charArray.length;i++) {
			if(i !=charArray.length-1) {
				System.out.print(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("字符串中的数字是：");
		for(char zf:charArray) {
			if (zf>='0'&&zf<='9') {
			    System.out.print(zf);
			}
		}
		System.out.println();
		System.out.print("字符串中的汉字是：");
		for(char zf:charArray) {
			if (zf>='\u4E00'&&zf<='\u9FA5') {
			    System.out.print(zf);
			}
		}
		System.out.println();
		System.out.println("将int值转化为String类型之后的结果："+String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果："+str.toUpperCase());
	}

}
