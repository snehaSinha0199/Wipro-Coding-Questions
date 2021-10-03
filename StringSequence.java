package wiprocodngquestion;

import java.util.Scanner;

public class StringSequence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0,value=0;
	String in = sc.nextLine();
	char[] ch = in.toCharArray();
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				value++;
			}
			
		}
		if(value==0) {
			count++;
		}
	}
	System.out.println(count);
}
}
