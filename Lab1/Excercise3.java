package Lab1;
import java.util.Scanner;

public class Excercise3 {
	public boolean checkNumber(int n) {
		boolean b=true;
		while(n>10) {
			if(n%10>=(n/10)%10) {
				n=n/10;
				continue;
			}
			else {
				b=false;
				break;
			}
			
		}
		return b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Excercise3 e3=new Excercise3();
		System.out.println(e3.checkNumber(n));

	}

}
