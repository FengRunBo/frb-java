package J11J4;

import java.util.ArrayList;
import java.util.Collections;

public class E625 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		Collections.addAll(list,"c","d","g","a");
		System.out.println("�����:"+list);
		Collections.reverse(list);
		System.out.println("��ת��:"+list);
		Collections.sort(list);
		System.out.println("����Ȼ˳�������:"+list);
		Collections.shuffle(list);
		System.out.println("�����˳�������:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("������βԪ�ؽ�����:"+list);

	}

}