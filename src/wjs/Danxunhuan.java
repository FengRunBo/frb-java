package wjs;

public class Danxunhuan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String[]yb= {"����ѧԺ","����ѧԺ","����ѧԺ","����ѧԺ","���ѧԺ","��ר��","��ʳѧԺ","�ֿ�"};
		
		for(int i=1;i< yb.length;i++)
		{
			System.out.println("��"+i+"��:");
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
