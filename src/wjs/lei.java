package wjs;

import java.io.Serializable;
//定义类
//修饰符+class+类名标示符+extends（继承关键字） 父类标示符+impements
//第一类修饰符表示作用范围：piblic共有的  proteted受保护的  prinate私有的
//第二类修饰符表示特定功能：static静态的 final最终的（该类没有子类）synchronized同步的


public class lei extends Object implements Serializable{
	//四个内部类
	public final static class A extends Object implements Serializable{	}
	private final static class B extends Object implements Serializable{	}
	
	protected final static class C extends Object implements Serializable{	}
	protected final static class D extends Object implements Serializable{	}
	//定义两个成员变量:修饰符+变量所属的数据类型+变量标示符
	private final static String name="";
	private final static int age=0;
	//定义两个成员方法
	//定义两个成员方法：修饰符+方法返回的值的数据类型+方法名（参数值的类型  参数名）{}
	//方法名前面现有修饰符（可省略）,方法名前面后有返回值类型（不可省略）
	//返回值类型为void表示空，方法体内不需要return语句
	//其他类型的返回值,方法体内都需要return语句
	//方法名后面先跟一对小括号，在跟一个大括号
	//方法名后面的一对小括号里面可以包含参数 ，格式是：参数类型  参数名
	private static final void setAge(int nianling) {
		
	}
	public int getAge() {
		return age;
	}
}
//private default protected public:可访问性由小到大，不仅可以修饰类class
//还可以修饰类的成员变量Field、类的成员方法Method
//pricate：类可见default：包可见性protected：子类可见性public：无限制
