package Lab9;
import java.math.*;

interface intf1{
	double Exponent(int x,int y);
}
public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf1 a=(int x,int y)-> Math.pow(x,y);
		System.out.println(a.Exponent(2, 3));
		

	}

}
