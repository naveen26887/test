package Lab6;
import java.util.*;

public class Excercise4 {
	
	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm){
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		for(Map.Entry<Integer,Integer>set:hm.entrySet()) {
			if(set.getValue()>=90) {
				hs.put(set.getKey(),"Gold");
			}
			else if(set.getValue()>=80 && set.getValue()<90) {
				hs.put(set.getKey(),"Silver");
			}
			else if(set.getValue()>=70 && set.getValue()<80) {
				hs.put(set.getKey(),"Bronze");
			}
			
		}
		return hs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excercise4 e4=new Excercise4();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1,90);
		hm.put(2,80);
		hm.put(4,86);
		hm.put(5,84);
		hm.put(6,98);
		System.out.println(e4.getStudents(hm));
		

	}

}
