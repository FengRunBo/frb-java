package wjs;
class Student{
	static String schoolName;
}
public class E12 {
	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
		Student.schoolName="�廪��ѧ";
		System.out.println("����"+stu1.schoolName+"��ѧ��");
		System.out.println("����"+stu2.schoolName+"��ѧ��");
	}
}