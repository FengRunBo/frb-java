package wjs;

public class Danxunhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[]yb= {"管理学院","教育学院","音乐学院","演艺学院","设计学院","中专部","饮食学院","轮空"};
		
		for(int i=1;i< yb.length;i++)
		{
			System.out.println("第"+i+"天:");
			if(i>1)
			{
				String stemp=yb[yb.length-1];
				for(int k=yb.length-1;k>1;k--)
				{
					yb[k]=yb[k-1];
				}
				yb[1]=stemp;
			}
			for(int j=0;j<yb.length/2;j++) {
				System.out.println(yb[j]+"vs"+yb[yb.length-j-1]);
			}
		}
	}

}
