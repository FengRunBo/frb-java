package J11J4;

import java.util.*;
import java.util.stream.Stream;



public class E638 {

	public static void main(String[] args) {
	List<String>list=Arrays.asList("����","����","������","����");
	Stream<String>parellelStream=list.parallelStream();
	System.out.println(parellelStream.isParallel());
	Stream<String>stream=Stream.of("����","����","������","����");
	Stream<String>parallel=stream.parallel();
	System.out.println(parallel.isParallel());
	}

}
