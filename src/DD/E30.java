package DD;

public class E30 {
	public static int divide(int x,int y) throws Exception{
		if(y==0) {
			throw new Exception("除数是0");
		}
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=divide(4,0);
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("捕获的一场信息为："+e.getMessage());
		}
	}

}
