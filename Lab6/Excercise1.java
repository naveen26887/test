package Lab6;
import java.util.*;
import java.util.Map.Entry;

public class Excercise1 {
	public HashMap<String,Integer> getValues(HashMap<String,Integer> hm){
		
		HashMap<String,Integer>hm1=new HashMap<String,Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>(hm.values());
		Collections.sort(al);
		for(Integer a:al) {
		for(Map.Entry<String,Integer>s1:hm.entrySet()) {
			if(s1.getValue()==a) {
				hm1.put(s1.getKey(), s1.getValue());
			}
			
		}
		}
		/*for(Map.Entry<String,Integer>s:hm.entrySet()) {
			al.add(s.getValue());
		}
		*/
		return hm1;
	}
	/*public List<Map.Entry<String,Integer>> getValues(HashMap<String,Integer> hm) {
		List<Map.Entry<String,Integer>> l=new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(l,new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String,Integer> m1,Map.Entry<String,Integer> m2) {
				return m1.getValue().compareTo(m2.getValue());
			}
		});
		/*Set<Entry<String, Integer>>s=hm.entrySet();
		
		for(Map.EntryMapElement :hm.entrySet()) {
			
		}
		Collection<Integer> s=hm.getValues();
		while(hm) {
			
		}*/
		//return l;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("abc",30);
		hm.put("xyz",10);
		hm.put("lmn",5);
		hm.put("abc",30);
		System.out.println(hm);
		System.out.println(hm);
		Excercise1 e1=new Excercise1();
		System.out.println(e1.getValues(hm));
		/*Set s3=hm.entrySet();
		System.out.println(s3.getClass().getName());
		for(int i=0;i<hm.size();i++) {
			System.out.println(hm.get(s3(i)));
		}
		Set s=hm.entrySet();
		for(Map.Entry e:hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println(hm.get("abc"));
		ArrayList<Map.Entry<String,Integer>> s2=new ArrayList<>(s);
		//Collections.sort(s2);
		System.out.println(s2);
		
	
		hm.put("djshjb", 48784);
		System.out.println(s);
		

	}

	private static Object s3(int i) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
}
