package Xuexiao;

public class Course1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Course s1=new Course();
		s1.setCourse_id("mike");
		s1.setCourse_name("china");
		s1.setCourse_book("yuwen");
		
		System.out.println(s1.getCourse_id());
		System.out.println(s1.getCourse_name()+"使用的教材是《"+s1.getCourse_book()+"》");


	}

}
