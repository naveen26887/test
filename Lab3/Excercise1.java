package Lab3;

import java.util.Arrays;

public class Excercise1 {
	public String alterString(String s) {
		char arr[]=s.toCharArray();
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<arr.length;i++) {
			switch(arr[i]) {
			case 'a':
				arr[i]='b';
				break;
			case 'e':
				arr[i]='f';
				break;
			case 'i':
				arr[i]='j';
				break;
			case 'o':
				arr[i]='p';
				break;
			case 'u':
				arr[i]='v';
				break;
			case 'A':
				arr[i]='B';
				break;
			case 'E':
				arr[i]='F';
				break;
			case 'I':
				arr[i]='J';
				break;
			case 'O':
				arr[i]='P';
				break;
			case 'U':
				arr[i]='V';
				break;
			default:
				break;
			}
		}
		String st=new String(arr);
		return st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Prudhvi";
		Excercise1 e1=new Excercise1();
		System.out.println(e1.alterString(str));

	}

}
