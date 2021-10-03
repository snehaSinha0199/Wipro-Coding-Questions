package wiprocodngquestion;

import java.util.Arrays;
import java.util.Scanner;

public class SalesVlaue {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int noOfArray = sc.nextInt();
	int placeValue=sc.nextInt();
	int[] arr=new int[noOfArray];
	for(int i=0;i<noOfArray;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(arr[placeValue-1]);
}
}
