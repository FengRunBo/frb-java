package CC;
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
		printName("閸掓ê鐥夐崡锟�",new PersonBuilder() {
			
			@Override
			public Person buildPerson(String name) {
				Person ren=new Person(name);
				// TODO 閼奉亜濮╅悽鐔稿灇閻ㄥ嫭鏌熷▔鏇炵摠閺嶏拷
				return ren;
			}
		});
		printName("闁厼鐦滈崺锟�",name->new Person(name));
		printName("瀵姴顒熼崣锟�",Person::new);
	}
	public static void printName(String name,PersonBuilder pb) {
		System.out.println(pb.buildPerson(name).getName());
	}
}
