package Lab3;
import java.util.Scanner;
public class Excercise3 {
	
	public String modifyNumber(int n) {
		int v=n%10;
		String s=Integer.toString(v);
		while(n>10) {
			s=Math.abs((n/10)%10-n%10)+s;
			n=n/10;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Excercise3 e3=new Excercise3();
	    System.out.println(e3.modifyNumber(n));

	}

}
