package wjs;

public class E10 {
	public static void main(String[] args) {
		int x=18;
		if(x>=18)
		{
			System.out.println("此人成年");
		}
		else {
			System.out.println("此人还小");
		}
		int yue=12;
		switch (yue) {
		case 12:
		case 1:
		case 2:
			System.out.println("这是冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("这是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("这是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("这是秋季");
			break;
		default:
			System.out.println("信息有误");
			break;
		}
	}
}
