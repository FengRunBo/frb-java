package J10J18;

public class Daxiaoxie {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StringBuffer s=new StringBuffer("HelloWorld");
		String dglzfc=s.reverse().toString();
		System.out.println(dglzfc);
		StringBuffer kc=new StringBuffer();
		char[] zfsz=dglzfc.toCharArray();
		for(int i=0;i<zfsz.length;i++) {
			char c=zfsz[i];
			if (Character.isLowerCase(c)) {
				String dxbxx=(""+c).toLowerCase();
				kc.append(dxbxx);
			}else if (Character.isLowerCase(c)) {
				String dxbxx=(""+c).toUpperCase();
				kc.append(dxbxx);
			}
		}
		System.out.println(kc);
	}

}
