package E501;

import java.io.IOException;

import javax.swing.text.rtf.RTFEditorKit;

public class E512 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO �Զ����ɵķ������
		Runtime rt=Runtime.getRuntime();
		System.out.println("�������ĸ�����"+rt.availableProcessors()+"��");
		System.out.println("�����ڴ��С��"+rt.freeMemory()/1024/1024+"M");
		System.out.println("�������ڴ��С��"+rt.maxMemory()/1024/1024+"M");
		rt.exec("notepad.exe");
		Process process=rt.exec("notepad.exe");
		Thread.sleep(3000);
		process.destroy();
	}

}
