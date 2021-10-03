package wiprocodngquestion;

import java.util.Scanner;

public class CountWords {
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	String in = sc.nextLine();
	in.trim();
	String[] arr = in.split(" ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i].trim();
		if(arr[i].length()>0)
		count++;
	}
	System.out.println(count);
}
}
