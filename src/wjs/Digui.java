package wjs;

public class Digui {
	//�ݹ����
	//�ڷ������ڲ��Լ��������Լ����ͼӷ����ĵݹ飬һ����˵����ֵ��һ��
	public static int getSum(int n) {
		//���ղ���ֵ
		if(n==1)return 1;
		int temp=getSum(n-1);
		//����1���⣬����������ǰԪ�صĺ��Լ�Ԫ�ر���
		return n+temp;
	}
	public static void main(String[] args) {
		System.out.println("1��100�ĺ���"+getSum(100));
	}
}
