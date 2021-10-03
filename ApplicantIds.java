package wiprocodngquestion;

import java.util.Scanner;

public class ApplicantIds {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	  String in = sc.nextLine();
	  char[] ch = in.toCharArray();
	  int length = ch.length;
	  int n = Integer.parseInt(in);
	  int[] arr=new int[length];
	  
	  while(n>0) {
		  arr[length-1]=n%10;
		  n=n/10;
		  length--;
	  }
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]%2==0) {
			  arr[i]=arr[i]+1;
		  }
		  else {
			  arr[i]=arr[i]-1;
		  }
	  }
	  for(int out:arr) {
		  System.out.print(out);
	  }
	  
}
}
