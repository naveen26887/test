package Lab1;
import java.util.Scanner;

public class Excercise2 {
	public int calculateDifference(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i*i;
		}
		return sum-((n*(n+1)/2)*(n*(n+1)/2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Excercise2 e2=new Excercise2();
		System.out.println(e2.calculateDifference(n));

	}

}
