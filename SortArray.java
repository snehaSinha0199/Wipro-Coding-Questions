package wiprocodngquestion;

import java.util.Scanner;

public class SortArray {
public static void main(String[] args) {
	int max=0;
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++) {
		for(int j=i+1;j==j;j++) {
			if(arr[i]<arr[j]) {
				max=arr[j];
			}
			
		}
	}
	System.out.println(max);
}
}
