package Lab6;
import java.util.*;

public class Excercise5 {
	public ArrayList<Integer> votersList(HashMap<Integer,Integer> hm){
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer>s:hm.entrySet()) {
			if(s.getValue()>18) {
				al.add(s.getKey());
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		hm.put(1, 12);
		hm.put(112, 42);
		hm.put(123, 65);
		hm.put(1154, 72);
		hm.put(1798, 16);
		hm.put(3582, 2);
		Excercise5 e5=new Excercise5();
		System.out.println(e5.votersList(hm));
		
		

	}

}
