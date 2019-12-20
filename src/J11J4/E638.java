package J11J4;

import java.util.*;
import java.util.stream.Stream;



public class E638 {

	public static void main(String[] args) {
	List<String>list=Arrays.asList("张了","李吗","张晓明","张阳");
	Stream<String>parellelStream=list.parallelStream();
	System.out.println(parellelStream.isParallel());
	Stream<String>stream=Stream.of("张了","李吗","张晓明","张阳");
	Stream<String>parallel=stream.parallel();
	System.out.println(parallel.isParallel());
	}

}
