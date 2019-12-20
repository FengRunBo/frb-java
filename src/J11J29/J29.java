package J11J29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.mysql.jdbc.authentication.MysqlClearPasswordPlugin;

public class J29 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("d:\\shili.xlsx");
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		XSSFSheet sheet =workbook_in.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			XSSFCell cell16=row.getCell(15);
			String z_shili=cell16.getStringCellValue();
			XSSFCell cell17=row.getCell(16);
			String y_shili=cell17.getStringCellValue();
			System.out.println(xuehao);
			System.out.println(z_shili);
			System.out.println(y_shili);
			Class.forName("com.mysql.jdbc.Driver");
			Connection lianjie=DriverManager.getConnection("jdbc:Mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8","root","123456");
			Statement yuju=lianjie.createStatement();
			String sql="update 18rj1 set `×óÑÛÂãÑÛÊÓÁ¦`='"+z_shili+"' where `Ñ§ºÅ`='"+xuehao+"'"; 
			String sql1="update 18rj1 set `ÓÒÑÛÂãÑÛÊÓÁ¦`='"+z_shili+"' where `Ñ§ºÅ`='"+xuehao+"'"; 
			yuju.execute(sql);
			yuju.execute(sql1);
		}
	}
}
