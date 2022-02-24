package Lab3;
import java.util.Scanner;

public class Excercise2 {
	
	public String getImage(String str) {
		String sb=new String(str);
		sb=sb+"|";
		for(int i=str.length()-1;i>=0;i--) {
			sb+=str.charAt(i);
			
		}
		return sb ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Excercise2 e3=new Excercise2();
		System.out.println(e3.getImage(str));
		

	}

}
