package pkg2;
import day1.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JavaBasics Em=new JavaBasics();
	Employee  E=new Employee();
	Student sdt=new Student("Ananya",24,"ECE",2016);
	sdt.n();
	Student s=new Student("Ananya",24,"ECE",2016);
	s.n();
	System.out.println(Student.c);
	System.out.println(Em.age);
	Em.age=24;
	E.name="Arjun";
	E.dept="Development";
	System.out.println(E.name);
	System.out.println(E.dept);
	System.out.println(Em.age);

	}

}
