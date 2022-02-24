package Lab9;

interface intf2{
	String spaceString(String s);
}

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf2 a=(String s)->
		{
			char[] ch=s.toCharArray();
			String str = "";
			for(char c:ch) {
				str+=Character.toString(c)+" ";
			}
			return str;
		};
		System.out.println(a.spaceString("Naveen"));

	}

}
