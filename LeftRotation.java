package wiprocodngquestion;

import java.util.*;

public class LeftRotation {
	public static int[] rotLeft(int arr[],int n) {
		for(int i=n;i>0;i--) {
			int temp=arr[i-1];
			arr[i-1]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d = sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int[] result = rotLeft(arr,d);
	for(int out:result) {
		System.out.print(out+" ");
	}
	
}
}
