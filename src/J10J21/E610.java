package J10J21;
import java.util.*;
class Student{
	String id;
	String name;
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return id.equals(other.id);
	
	}
	public Student(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
}

public class E610 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet hS=new HashSet<>();
		Student Stu1=new Student("1","jack");
		Student Stu2=new Student("2","Rose");
		Student Stu3=new Student("3","Rose");
		hS.add(Stu1);
		hS.add(Stu2);
		hS.add(Stu3);
		System.out.println(hS);
		
	}

}
