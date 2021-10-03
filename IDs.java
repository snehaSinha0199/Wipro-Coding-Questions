package wiprocodngquestion;

import java.util.Arrays;
import java.util.Scanner;

public class IDs {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String in = sc.nextLine();
	char[] ch = in.toCharArray();
	int length = ch.length;
	int n = Integer.parseInt(in);
	
	int smallest=0;
	int[] arr=new int[length];
	for(int i=0;i<n;i++) {
		arr[i]=n%10;
		n=n/10;
		
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				smallest=arr[i];
			}
		}
	}
	System.out.println(smallest);
	
	
}
}
