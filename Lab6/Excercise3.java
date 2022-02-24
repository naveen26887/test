package Lab6;
import java.util.*;

public class Excercise3 {
	public static HashMap<Integer,Integer> getSquares(int[] n){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i:n) {
			hm.put(i,i*i);
		}
		return hm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,2,3,4,5,6,7,8};
		System.out.println(Excercise3.getSquares(n));

	}

}
