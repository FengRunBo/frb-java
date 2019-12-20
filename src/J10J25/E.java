package J10J25;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
public class E {

	public static void main(String[] args)throws Exception {
		// TODO 自动生成的方法存根
		Properties pps=new Properties();
		pps.load(new FileInputStream("test.properties"));
		pps.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out=new FileOutputStream("test.properties");
		pps.setProperty("charset","UTF-8");
		pps.store(out,"新增charset编码");
	}

}
