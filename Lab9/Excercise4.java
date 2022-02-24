package Lab9;


class Test{
	String name;
	int age;

	Test(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

interface Intff1{
	Test Test(String name,int age);
}

public class Excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intff1 a=Test::new;
		Test t1=a.Test("Rohith Sharma",35 );
		Test t2 =a.Test("Kl Rahul",29);
		System.out.println(t1.getAge());
		
		

	}

}
