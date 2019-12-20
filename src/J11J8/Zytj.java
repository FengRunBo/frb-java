package J11J8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Zytj {
	static HashMap<String,Integer> hm=new HashMap<>();

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		
		FileInputStream fin=new FileInputStream("18rj1.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		String xsm=br.readLine();
		while (xsm!=null) {
			hm.put(xsm,0);
			xsm=br.readLine();
		}
		File file=new File("c:\\18软件1班作业");
		fileDir(file);
		System.out.println(hm);
	}
	private static void fileDir (File file) {
		File[] files=file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				String wjm=f.getName();
				hm.forEach((xsm,cs)->{
					if (wjm.contains(xsm)) {
						cs=cs+1;
						hm.put(xsm,cs);
					}
			
			});
				fileDir(f);
			}
		}
	}
}
