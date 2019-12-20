package J10J22;
import java.util.TreeSet;
class Teacher implements Comparable{
	String name;
	int age;
	public Teacher(String naem,int age) {
		this.name=name;
		this.age=age;
	}
	public String tostring() {
		return name+":"+age;
	}
	public int compareTo(Object obj) {
		Teacher s=(Teacher) obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if (this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return-1;
	}
}
public class E612 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet tSet=new TreeSet<>();
		tSet.add(new Teacher("Jack",19));
		tSet.add(new Teacher("Rose",18));
		tSet.add(new Teacher("Tom",19));
		tSet.add(new Teacher("Rose",18));
		System.out.println(tSet);
	}

}
