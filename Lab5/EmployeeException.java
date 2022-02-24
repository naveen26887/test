package Lab5;

public class EmployeeException extends Exception {
    EmployeeException(String s){
    	super(s);
    }
    EmployeeException(){
    }
	
	EmployeeException(Employee emp){
		try {
			if(emp.salary>3000) {
				System.out.println("Good Salary");
			}
			else {
				throw new EmployeeException();
			}
		}
		catch(EmployeeException e) {
			e.printStackTrace();
			System.out.println("Salary is less than 3000");
		}
	}
}