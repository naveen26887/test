package Lab5;
import java.util.Scanner;

class AgeException extends Exception {
	AgeException(String s){
		super(s);
	}

}
public class Excercise1 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>15) {
			System.out.println("allowed");
		}
		else {
			throw new AgeException("Not Allowed");
		}

	}

}
