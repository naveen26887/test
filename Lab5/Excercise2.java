package Lab5;
import java.util.Scanner;

class NameException extends Exception {
	NameException(String s){
		super(s);
	}

}

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String fname="";
		String Lname="";
		try {
			if(fname=="" && Lname=="") {
				throw new NameException("No Name");
			}
			else {
			System.out.println(fname+" "+Lname);
			}
		}
		catch(NameException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
