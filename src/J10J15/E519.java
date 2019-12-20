package J10J15;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class E519 {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis()+1000);
		System.out.println(date2);
		System.out.println(date1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyy年MM月dd日HH时mm分ss秒,E");
		System.out.println(sdf.format(date1));
		
		Calendar rili=Calendar.getInstance();
		int nian=rili.get(Calendar.YEAR);
		int yue=rili.get(Calendar.MONTH)+1;
		int ri=rili.get(Calendar.DATE);
		System.out.println("今天是"+nian+"年"+yue+"月"+ri+"日");
		
		rili.set(nian,yue,ri);
		rili.add(Calendar.DATE, 100);
		nian=rili.get(Calendar.YEAR);
		yue=rili.get(Calendar.MONTH);
		ri=rili.get(Calendar.DATE);
		System.out.println("一百天以后是"+nian+"年"+yue+"月"+ri+"日");
		
		
		LocalDate dqrp=LocalDate.now();
		LocalDate J_100=dqrp.plusDays(100);
		System.out.println(J_100);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyy-MM-dd");
		String ybtyh_zfc=J_100.toString();
		Date date_100=sdf1.parse(ybtyh_zfc);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyy年MM月dd日");
		System.out.println("一百天以后是："+sdf2.format(date_100));
		
		
		
	}

}
