package wiprocodngquestion;

import java.util.Scanner;

public class Matrix {
public static void main(String[] args) {
	int sum=0;
	int output=0;
	Scanner sc=new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int[][] arr=new int[m][n];
	int[] result=new int[m];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			arr[i][j]=sc.nextInt();
			sum+=arr[i][j];
			
		}
		System.out.println("Row "+(i+1)+": "+sum);
		result[i]=sum;
		sum=0;
		
	}
	for(int i=0;i<result.length;i++) {
		for(int j=i+1;j<result.length;j++) {
			if(result[i]<result[j]) {
				output=result[j];
			}
		}
	}
	System.out.println(output );
}
}
