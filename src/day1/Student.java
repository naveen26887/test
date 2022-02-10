package day1;

public class Student {
	public String name;
	public int age;
	public String branch;
	public int year;
	public static int c=0;
	
	public Student(String name,int age,String branch,int year){
		this.name=name;
		this.age=age;
		this.branch=branch;
		this.year=year;
		c++;
	}
	
    public void n() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(branch);
		System.out.println(year);
	}
    void coun() {
    	System.out.println(c);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std=new Student("Karthik",27,"ECE",2013);
		std.n();
		

	}

}
