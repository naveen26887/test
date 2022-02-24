package Lab6;
import java.util.*;

public class Excercise7 {
	public static int getSecondSmallest(int[] n) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int a:n) {
			al.add(a);
		}
		Collections.sort(al);
		return al.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,52,76,345,23,65};
		System.out.println(Excercise7.getSecondSmallest(arr));

	}

}
