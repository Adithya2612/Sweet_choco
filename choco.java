package com.code;
import java.util.Arrays;
import java.util.Scanner;
	public class choco_sweet{
	       public void sort(String[] choc) {
	      int len=choc.length,min;
	           for(int a=0;a<len-1;a++) {
	        	   min=a
	          for(int b=a+1;b<choc.length;b++) {
	        	  if(choc[min]>choc[b])
	        		  min=b
	          }
	          String temp=choc[a];
	          choc[a]=choc[b];
	          choc[b]=temp;
	          }
	           }
	       
	      for(int a=0;a<len-1;a++)
	      System.out.println(choc[a]);
	       }
	}
	public class  Candies{    
	    public void candies(String[] candy) {
	    System.out.println("No.of candies present are :",candy.length);
	   
	    }
	}
	public class Weeiht_of_sweets{
	    public void sweets(String [] choc, String[] candy) {
	    System.out.println("Weight of strings:",(choc.length+candy.length));
	    }
	}
	public class Sweet_Choco{
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int n, nc, a;
	   String choc[] = new String[5];
	   String candy[] = new String[5];
	   nc=s.nextInt();
	   for(a=0;a<nc;a++) {
	    System.out.print("Enter name of chocolate:");
	    choc[a]=s.next();
	   }  
	   System.out.print("enter chocolate count:");
	nc=s.nextInt();
	for(a=0;a<nc;a++) {
	   System.out.print("Enter Candy name:");
	   candy[a]=s.next();
	   }
	choco_sweet c=new choco_sweet();
	c.sort(choc[5]);
	Candies cd=new Candies;
	cd.candies(candy[5]);
	Sweet_Choco sc=new Sweet_Choco();
	sc.sweets(choc[5], candy[5]);
	}
	}

	      
}
