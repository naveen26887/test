package Lab2;

public class Excercise4 {
	public int[] modifyArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int[] arr1=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				continue;
			}
			else {
			arr1[j]=arr[i];
			j+=1;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,4,5,7,6,8,9,6};
		Excercise4 e4=new Excercise4();
		for(int i:e4.modifyArray(arr)) {
			System.out.print(i+" ");
			
		}

	}

}
