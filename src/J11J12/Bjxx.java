package J11J12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjxx {

	public static void main(String[] args) throws Exception {
		Path wj=Paths.get("d:/tice/�༶��Ϣ.txt");
		Path wj2=Paths.get("d:/tice/��༶���.txt");
		Path wj3=Paths.get("d:/tice/�༶���.txt");
		Files.createFile(wj3);
		/*try {
			Files.createFile(wj);
			System.out.println("Ŀ¼�����ɹ�");
		}catch (IOException e) {
			System.out.println("Ŀ¼����bu�ɹ�");
		}*/
		List list=new ArrayList<>();
		List<String>lines=Files.readAllLines(wj);
		List<String>lines2=Files.readAllLines(wj2);
		//System.out.println("�ļ��е�����Ϊ��"+lines);
		//lines.forEach(x->System.out.println(x));
		Map<String,String>map=new HashMap<>();
		for (String line:lines) {
			String[] zfcsz=line.split("	");
			map.put(zfcsz[1],zfcsz[0]);
			
		}
		System.out.println(lines2);
		for(String line2:lines2) {
			list.add(map.get(line2));
		}
		System.out.println(list);
		Files.write(wj3,list,StandardOpenOption.APPEND);
	}

}
