package J11J12;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class E7021 {

	public static void main(String[] args) throws IOException {
		Path directoryPath=Paths.get("d:/tice/�༶��Ϣ.txt");
		Files.createDirectories(directoryPath);
		System.out.println("Ŀ¼�����ɹ�");
		Path filePath=Paths.get("d:/tice/��༶���.txt");
		Files.createFile(filePath);
		List<String>list=new ArrayList<String>();
		list.add("����һ�������ļ�");
		Files.write(filePath,list,StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(filePath);
		System.out.println("�ļ��Ĵ�СΪ��"+Files.size(filePath));
		System.out.println("�ļ��е�����Ϊ��"+lines);
	}

}
