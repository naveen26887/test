package Lab9;
interface intf3{
	boolean valid(String s1,String s2);
}

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf3 a=(String s1,String s2)->
				{
					String us="Naveen123";
					String pwd="asdf@123";
					if(s1.equals(us) && s2.equals(pwd)) {
						return true;
					}
					else {
						return false;
					}
			 
				};
		System.out.println(a.valid("Naveen123","asdf@123"));
		System.out.println(a.valid("Naveen123","asdf123"));

	}

}
