package DD;

public class E29 {
	public static int divide(int x,int y) {
		try {
			int result=x/y;
			return result;
		}catch (Exception e) {
			System.out.println("捕获的一场信息为："+e.getMessage());
		}
		return-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=divide(4,0);
		if(result==-1) {
			System.out.println("程序发生错误");
		}else {
			System.out.println(result);
		}
	}

}
