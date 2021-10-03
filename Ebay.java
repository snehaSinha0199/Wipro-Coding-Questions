package wiprocodngquestion;

import java.util.Scanner;

public class Ebay {
public static void main(String[] args) {
	/**Scanner sc=new Scanner(System.in);
	int product = sc.nextInt();
	String price = sc.nextLine();
	String[] s1 = price.split(" ");
	int[] pop=new int[product];
	for(int i=0;i<product;i++) {
		pop[i] = Integer.valueOf(s1[i]);
		
	}
	String distance = sc.nextLine();
	String[] s2 = price.split(" ");
	int[] ship=new int[product];
	for(int i=0;i<product;i++) {
		ship[i] = Integer.valueOf(s2[i]);
		
	}
	String sku = sc.nextLine();
	String[] s3 = price.split(" ");
	int[] skus=new int[product];
	for(int i=0;i<product;i++) {
		skus[i] = Integer.valueOf(s3[i]);
		
	}
	for(int i=0;i<product;i++) {
		if(skus[i]>0) {
			int result=pop[i]*ship[i];
			System.out.print(result+" ");
		}
	}*/
	
	Scanner sc=new Scanner(System.in);
    int noOfProducts=sc.nextInt();
    
    int price[]=new int[noOfProducts];
    int distance[]=new int[noOfProducts];
    int sku[]=new int[noOfProducts];
    
    for(int i=0;i<noOfProducts;i++)
        price[i]=sc.nextInt();
    
    for(int i=0;i<noOfProducts;i++)
        distance[i]=sc.nextInt();
    
    for(int i=0;i<noOfProducts;i++)
        sku[i]=sc.nextInt();
    
    int finalPrice[]=new int[noOfProducts];
    int count =0;
    
    for(int i=0;i<noOfProducts;i++)
    {
        if(sku[i]>0)
        {
            finalPrice[count]= price[i] * distance[i];
            count++;
        }
    }
    
    for(int i=0;i<count;i++)
    {
        System.out.print(finalPrice[i]+" ");
    }

}
}
