package DD;

public class E29 {
	public static int divide(int x,int y) {
		try {
			int result=x/y;
			return result;
		}catch (Exception e) {
			System.out.println("�����һ����ϢΪ��"+e.getMessage());
		}
		return-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=divide(4,0);
		if(result==-1) {
			System.out.println("����������");
		}else {
			System.out.println(result);
		}
	}

}
