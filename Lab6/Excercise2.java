package Lab6;
import java.util.*;

public class Excercise2 {
	
	public HashMap<Character,Integer> countChars(char[] ch){
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
			int c=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c+=1;
				}
			}
			hm.put(ch[i],c);
			
		}
		return hm;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'a','b','c','b','a','a','c'};
		Excercise2 e2=new Excercise2();
		System.out.println(e2.countChars(ch));

	}

}
