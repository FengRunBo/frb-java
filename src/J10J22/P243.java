package J10J22;
import java.util.*;
class Person{
	String id;
	String name;
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return id.equals(other.id);
	
	}
	public Person(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
}

public class P243 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet hS=new HashSet<>();
		Person Stu1=new Person("1","jack");
		Person Stu2=new Person("2","Rose");
		Person Stu3=new Person("3","Rose");
		hS.add(Stu1);
		hS.add(Stu2);
		hS.add(Stu3);
		System.out.println(hS);
		
	}

}
