package Lab1;

public class Excercise1 {
	static int sum;
	public int calculateSum(int n) {
		
		for(int i=0;i<n;i+=2) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excercise1 e1=new Excercise1();
		System.out.println(e1.calculateSum(24));

	}

}
