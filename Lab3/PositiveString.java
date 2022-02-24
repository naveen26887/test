package Lab3;
import java.util.Scanner;

public class PositiveString {
	public static boolean checkString(String s) {
		char[] ch=s.toCharArray();
		boolean b=true;
		for(int i=0;i<s.length()-1;i++) {
		if((int)ch[i]<(int)ch[i+1]) {
			continue;
		}
		else {
			b=false;
			break;
		}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(PositiveString.checkString(str));

	}

}
