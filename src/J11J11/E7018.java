package J11J11;

import java.nio.CharBuffer;

import javax.naming.LimitExceededException;

public class E7018 {

	public static void main(String[] args) {
		CharBuffer charBuffer=CharBuffer.allocate(6);
		System.out.println("容量："+charBuffer.capacity());
		System.out.println("界限值："+charBuffer.limit());
		System.out.println("初始位置："+charBuffer.position());
		charBuffer.put('x');
		charBuffer.put('z');
		charBuffer.put('y');
		System.out.println("加入元素后得 界限值："+charBuffer.limit());
		System.out.println("加入元素后得位置："+charBuffer.position());
		charBuffer.flip();
		System.out.println("执行flip（）后的界限值："+charBuffer.limit());
		System.out.println("执行flip（）后的位置："+charBuffer.position());
		System.out.println("取出的第一个元素为："+charBuffer.get());
		System.out.println("取出后的界限值："+charBuffer.limit());
		System.out.println("取出后的位置："+charBuffer.position());
		charBuffer.clear();
		System.out.println("执行clear（）后的界限值："+charBuffer.limit());
		System.out.println("执行clear（）后的位置："+charBuffer.position());
		System.out.println("取出的第一个元素为："+charBuffer.get(0));
		System.out.println("取出后的界限值："+charBuffer.limit());
		System.out.println("取出后的位置："+charBuffer.position());
	}

}
