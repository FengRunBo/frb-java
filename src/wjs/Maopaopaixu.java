package wjs;

public class Maopaopaixu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]= {9,8,3,5,2};
		for(int xiao:a)
		{
			System.out.print(xiao);
		}
		System.out.println();
		System.out.println(a.length);
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{	
				if(a[j]>a[j+1])
				{
					int x=a[j];
					a[j]=a[j+1];
					a[j+1]=x;
				}
			}
		}
		for(int xiao:a)
		{
			System.out.print(xiao);
		}
	}

}
