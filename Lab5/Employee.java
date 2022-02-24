package Lab5;


public class Employee {
	public String fname;
	public String Lname;
    public double salary;
    Employee(String fname,String Lname,double salary){
    	this.fname=fname;
    	this.Lname=Lname;
    	this.salary=salary;
    }
    public static void main(String[] args)throws EmployeeException {
    	Employee e1=new Employee("Naveen","Reddy",400);
    	Employee e2=new Employee("Satya","esfkjjfj",3004);
    	//try {
    	new EmployeeException(e1);
    	new EmployeeException(e2);

}
}
