package J11J12;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class E7021 {

	public static void main(String[] args) throws IOException {
		Path directoryPath=Paths.get("d:/tice/班级信息.txt");
		Files.createDirectories(directoryPath);
		System.out.println("目录创建成功");
		Path filePath=Paths.get("d:/tice/求班级编号.txt");
		Files.createFile(filePath);
		List<String>list=new ArrayList<String>();
		list.add("这是一个测试文件");
		Files.write(filePath,list,StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(filePath);
		System.out.println("文件的大小为："+Files.size(filePath));
		System.out.println("文件中的内容为："+lines);
	}

}
