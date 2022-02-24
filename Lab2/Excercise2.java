
package Lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {
	
	public void sortStrings(String[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		String[] str= {"Madhav","Shahid","Dhileep"};
		Excercise2 e2=new Excercise2();
		e2.sortStrings(str);
	}
}
