package J10J15;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class E519 {

	public static void main(String[] args) throws ParseException {
		// TODO �Զ����ɵķ������
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis()+1000);
		System.out.println(date2);
		System.out.println(date1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyy��MM��dd��HHʱmm��ss��,E");
		System.out.println(sdf.format(date1));
		
		Calendar rili=Calendar.getInstance();
		int nian=rili.get(Calendar.YEAR);
		int yue=rili.get(Calendar.MONTH)+1;
		int ri=rili.get(Calendar.DATE);
		System.out.println("������"+nian+"��"+yue+"��"+ri+"��");
		
		rili.set(nian,yue,ri);
		rili.add(Calendar.DATE, 100);
		nian=rili.get(Calendar.YEAR);
		yue=rili.get(Calendar.MONTH);
		ri=rili.get(Calendar.DATE);
		System.out.println("һ�����Ժ���"+nian+"��"+yue+"��"+ri+"��");
		
		
		LocalDate dqrp=LocalDate.now();
		LocalDate J_100=dqrp.plusDays(100);
		System.out.println(J_100);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyy-MM-dd");
		String ybtyh_zfc=J_100.toString();
		Date date_100=sdf1.parse(ybtyh_zfc);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyy��MM��dd��");
		System.out.println("һ�����Ժ��ǣ�"+sdf2.format(date_100));
		
		
		
	}

}
