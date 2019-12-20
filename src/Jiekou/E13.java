package Jiekou;
interface Animal{
	public abstract void shout();
}
class Dog implements Animal{
	public void shout() {
		System.out.println("旺旺");
	}
}

public class E13 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}
}
//接口中没有成员变量
//只有public static final的成员常量
//public static final三个关键字可以省略
//abstract抽象
//接口中的方法都是public abstract
//public abstract两个关键字可以省略
	
