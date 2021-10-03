package wiprocodngquestion;

import java.util.Scanner;

public class EmployeeIDs {
public static void main(String[] args) {
	int result=0;
	boolean flag=false;
	Scanner sc=new Scanner(System.in);
	int no = sc.nextInt();
	int m=sc.nextInt();
	int n=sc.nextInt();
	int[] arr=new int[no];
	for(int i=0;i<no;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<no;i++) {
		if(arr[i]>m && arr[i]<n) {
		flag=true;	
		System.out.print(i+" ");
		}
	}
	if(flag==false) {
		System.out.println("-1");
	}
}
}
