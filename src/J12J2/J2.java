package J12J2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.Field;

public class J2 {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		lianjie=DriverManager.getConnection("jdbc:Mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8","root","123456");// TODO 自动生成的方法存根
		File mulu=new File("d:\\tice");
		File[] files=mulu.listFiles();
		System.out.println("一共有"+files.length+"个文件");
		for(File file : files) {
			if (file.getName().endsWith("xlsx")) {
				dqbxrmgwj_xlsx(file);
			}
			else if (file.getName().endsWith("xls")) {
				dqbxrmgwj_xls(file);
			}
		}
	
	}

	private static void dqbxrmgwj_xls(File file) throws Exception {
		FileInputStream fin=new FileInputStream(file);
		HSSFWorkbook workbook_in=new HSSFWorkbook(fin);
		HSSFSheet sheet =workbook_in.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			System.out.println(file);
			HSSFRow row=sheet.getRow(i);
			if (row==null) {
				System.out.println(file+"是空的");
				break;
			}
			HSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			if (xuehao.equals("学号")) {
				continue;
			}
			HSSFCell cell20=row.getCell(19);
			HSSFCell cell21=row.getCell(20);
			if (cell20!=null&&cell21!=null) {
				String z_shili=cell20.getStringCellValue();
				String y_shili=cell21.getStringCellValue();
				Statement yuju=lianjie.createStatement();
				String sql="update sheet1 set `左眼裸眼视力`='"+z_shili+"' where `学号`='"+xuehao+"'"; 
				String sql1="update sheet1 set `右眼裸眼视力`='"+y_shili+"' where `学号`='"+xuehao+"'"; 
				yuju.executeUpdate(sql);
				yuju.executeUpdate(sql1);
			}
		}
	}
	private static void dqbxrmgwj_xlsx(File file) throws Exception {
		FileInputStream fin=new FileInputStream(file);
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		XSSFSheet sheet =workbook_in.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			System.out.println(file);
			XSSFRow row=sheet.getRow(i);
			if (row==null) {
				System.out.println(file+"是空的");
				break;
			}
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			if (xuehao.equals("学号")) {
				continue;
			}
			XSSFCell cell20=row.getCell(19);
			XSSFCell cell21=row.getCell(20);
			if (cell20!=null&&cell21!=null) {
				String z_shili=cell20.getStringCellValue();
				String y_shili=cell21.getStringCellValue();
				PreparedStatement yudingyi_yuju=lianjie.prepareStatement("update sheet1 set `左眼裸眼视力`=?, `右眼裸眼视力`=?,where `学号`=?");
				yudingyi_yuju.setString(1, z_shili);
				yudingyi_yuju.setString(2, y_shili);
				yudingyi_yuju.setString(3, xuehao);
				yudingyi_yuju.executeUpdate();

			}
		}
	}
}
