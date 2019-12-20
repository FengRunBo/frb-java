package E501;

public class E511 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] srcArray= {101,102,103,104,105,106};
		
		int[] destArray= {201,202,203,204,205};
		System.arraycopy(srcArray,2, destArray,0,4);
		for(int i=0;i<destArray.length;i++) {
			System.out.println(i+":"+destArray[i]);
		}
	}

}
