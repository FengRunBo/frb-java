package J11J8;

import java.io.File;
import java.util.Arrays;

import javax.naming.directory.DirContext;

public class E7013 {
	public static void main(String[] args) {
		File file=new File("d:\\Java»ù´¡ÈëÃÅ");
		if (file.isDirectory()) {
			String[] fileName=file.list((dir,name)->name.endsWith(".txt"));
			Arrays.stream(fileName).forEach(f->System.out.println());
		}
	}
}
