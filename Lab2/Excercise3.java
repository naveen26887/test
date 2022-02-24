package Lab2;

import java.util.Arrays;

public class Excercise3 {
	public int[] getSorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int s=0;
			while(arr[i]>0) {
				s=s*10+arr[i]%10;
				arr[i]=arr[i]/10;
			}
			arr[i]=s;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {123,234,345,456,678};
		Excercise3 e3=new Excercise3();
		for(int i:e3.getSorted(arr)) {
			System.out.println(i+" ");
			
		}

	}

}
