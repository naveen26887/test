package Lab6;
import java.util.*;

public class Excercise6 {
	public ArrayList<Integer> getSorted(int[] arr) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		for(int a:arr) {
			int s=0;
			while(a>0) {
				s=s*10+a%10;
				a=a/10;
				}
			a1.add(s);
			
		}
	   Collections.sort(a1);
	   return a1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excercise6 e6=new Excercise6();
		int arr[]= {23,45,32,176,984,93};
		System.out.println(e6.getSorted(arr));

	}

}
