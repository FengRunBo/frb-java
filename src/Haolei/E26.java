package Haolei;
@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class E26 {
	public static void main(String[] args) {
		printName("鍒樺痉鍗�",new PersonBuilder() {
			
			@Override
			public Person buildPerson(String name) {
				Person ren=new Person(name);
				// TODO 鑷姩鐢熸垚鐨勬柟娉曞瓨鏍�
				return ren;
			}
		});
		printName("閮瘜鍩�",name->new Person(name));
		printName("寮犲鍙�",Person::new);
	}
	public static void printName(String name,PersonBuilder pb) {
		System.out.println(pb.buildPerson(name).getName());
	}
}
