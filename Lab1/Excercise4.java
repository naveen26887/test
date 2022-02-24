package Lab1;
import java.util.Scanner;

public class Excercise4 {
	public boolean checkNumber(int n) {
		boolean b=true;
		while(n>0) {
			if(n%2==0) {
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
		Excercise4 e4=new Excercise4();
		System.out.println(e4.checkNumber(n));

	}

}
