package wjs;
class Student{
	static String schoolName;
}
public class E12 {
	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
		Student.schoolName="清华大学";
		System.out.println("我是"+stu1.schoolName+"的学生");
		System.out.println("我是"+stu2.schoolName+"的学生");
	}
}
