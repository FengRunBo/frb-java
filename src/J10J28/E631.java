package J10J28;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E631 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("张三");
		list.add("里斯");
		list.add("张晓明");
		list.add("张扬");
		list.add("张hao");
		list.add("张yang");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("张"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		list.stream().filter(i->i.startsWith("张")).filter(h->h.length()>2)
		.limit(2).skip(2)
		.forEach(j->System.out.println(j));
		List<String> xlb=list.stream().filter(y->y.startsWith("张")).collect(Collectors.toList());
		System.out.println(list);
		String string=list.stream().filter(y->y.startsWith("张")).collect(Collectors.joining("and"));
		System.out.println(string);
	}

}
