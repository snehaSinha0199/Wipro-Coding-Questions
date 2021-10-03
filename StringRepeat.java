package wiprocodngquestion;

import java.util.Scanner;

public class StringRepeat {
	 
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	String word= sc.nextLine();
	String[] split = word.split(" ");
	String target = sc.nextLine();
	for(int i=0;i<split.length;i++) {
		if(split[i].equals(target))
			count++;
	}
	System.out.println(count);
	
}
}
