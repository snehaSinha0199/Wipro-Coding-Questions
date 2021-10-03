package wiprocodngquestion;

import java.util.*;

public class PairsSocks {
public static void main(String[] args) {
	int pairs=0;
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		label:for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j] && arr[j]!=-1) {
				pairs++;
				arr[j]=-1;
				break label;
			}
			
		}
	}
	System.out.println(pairs);
	
}
}
