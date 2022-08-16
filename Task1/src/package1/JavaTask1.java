package package1;

import java.util.Scanner;

public class JavaTask1 {
	    public static void main(String[] args) {
	    	Scanner name = new Scanner(System.in);
	    	System.out.print("Enter a string: ");  
	    	String name1 = name.nextLine();      
		int i, Vcount = 0, Ccount=0;
		int length = name1.length();
		for(i=0;i<length;i++)
		{
		   if((name1.charAt(i))== 'a' || (name1.charAt(i))== 'e' || (name1.charAt(i))== 'i' || (name1.charAt(i))== 'o' || (name1.charAt(i))== 'u' || (name1.charAt(i))== 'A' || (name1.charAt(i))== 'E' || (name1.charAt(i))== 'I'|| (name1.charAt(i))== 'O'  || (name1.charAt(i))== 'U' )
		   {
		       Vcount++;
		   }
		}
		System.out.println("Count of vowels: " + Vcount);
		for(i=0;i<length;i++)
		{
		   if((name1.charAt(i))!= 'a' && (name1.charAt(i))!= 'e' && (name1.charAt(i))!= 'i' && (name1.charAt(i))!= 'o' && (name1.charAt(i))!= 'u' && (name1.charAt(i))!= 'A' && (name1.charAt(i))!= 'E' && (name1.charAt(i))!= 'I'&& (name1.charAt(i))!= 'O' && (name1.charAt(i))!= 'U' )
		   {
		       Ccount++;
		   }
		}
		System.out.println("Count of Consonant: " +Ccount);
	    }
	}
