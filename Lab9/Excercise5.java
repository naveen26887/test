package Lab9;

interface inttf2{
	int findFactorial(int num);
}

class Factorial{
	int findFactorial(int num) {
	if(num==0) {
		return 1;
	}
	else {
		return num*findFactorial(num-1);
	}
}
}

public class Excercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f1=new Factorial();
		inttf2 it=f1::findFactorial;
		System.out.println(it.findFactorial(5));

	}

}
