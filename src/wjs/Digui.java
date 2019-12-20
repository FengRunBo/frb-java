package wjs;

public class Digui {
	//递归求和
	//在方法的内部自己调节用自己，就加方法的递归，一般来说参数值不一样
	public static int getSum(int n) {
		//最终参数值
		if(n==1)return 1;
		int temp=getSum(n-1);
		//除了1以外，都加上它面前元素的和以及元素本身
		return n+temp;
	}
	public static void main(String[] args) {
		System.out.println("1到100的和是"+getSum(100));
	}
}
