package J11J8;

import java.io.*;

public class E7015 {

	public static void main(String[] args) {
		File file=new File("d:\\Java��������");
		fileDir(file);
		
	}

	private static void fileDir(File file) {
		// TODO �Զ����ɵķ������
		File[] listFiles=file.listFiles();
		for (File files : listFiles) {
			if (files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}

}
