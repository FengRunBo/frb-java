package J11J11;
import java.io.*;
import java.security.acl.Permission;


public class EEE {

	public static void main(String[] args) throws Exception{
		E2691 p1=new E2691(20,"Mike");
		FileOutputStream fout=new FileOutputStream("person.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(p1);
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("person.txt"));
		E2691 p=(E2691) oin.readObject();
		System.out.println(p);
	}

}
