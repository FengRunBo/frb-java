package J10J15;
import java.util.*;
public class E522 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.MONTH,13);
		System.out.println(calendar.getTime());
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH,13);
		System.out.println(calendar.getTime());
	}

}
