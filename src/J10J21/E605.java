package J10J21;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class E605 {
static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		for (String str : strs) {
			str="add";
		}
		System.out.println("foreachѭ���޸ĺ�����飺"+strs[0]+","+strs[1]+","+strs[2]);
		for (int i=0;i<strs.length;i++) {
			strs[i]="add";
		}
		System.out.println("��ͨforѭ���޸ĺ�����飺"+strs[0]+","+strs[1]+","+strs[2]);
	}
}
