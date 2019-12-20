package Xuexiao;
//POJO

public class Xuesheng {
	//定义连个成员变量
	//private:类可见性  当前属性只能在本类中被访问
	private String xingming;
	//没有修饰符：包可见性 当前属性只能在本包中被访问
	private int chengji;
	//如果没有定义任何构造方法，java虚拟机会自动创建一个无参的构造方法
	//如果有了带参数的构造方法，java虚拟机将不会自动创建一个无参的构造方法
	//不管什么情况，都给类添加一个无参数的构造方法
	//定义无参的构造方法：
	//构造方法是一个特殊的方法：修饰符+类名([参数类型 参数名]){}
	public Xuesheng() {
		//定义有参的构造方法
	}
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public int getChengji() {
		return chengji;
	}
	public void setChengji(int chengji) {
		this.chengji = chengji;
	}
	
}
