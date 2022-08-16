package package1;

public class Class1 
{ 
	public static void main(String[] args) {
        String name = "Helan";
    int i, Vcount = 0, Ccount=0;
    int length = name.length();
    for(i=0;i<length;i++)
    {
       if((name.charAt(i))== 'a' || (name.charAt(i))== 'e' || (name.charAt(i))== 'i' || (name.charAt(i))== 'o' || (name.charAt(i))== 'u' || (name.charAt(i))== 'A' || (name.charAt(i))== 'E' || (name.charAt(i))== 'I'|| (name.charAt(i))== 'O'  || (name.charAt(i))== 'U' )
       {
           Vcount++;
       }
    }
    System.out.println("Count of vowels: " + Vcount);
    for(i=0;i<length;i++)
    {
       if((name.charAt(i))!= 'a' && (name.charAt(i))!= 'e' && (name.charAt(i))!= 'i' && (name.charAt(i))!= 'o' && (name.charAt(i))!= 'u' && (name.charAt(i))!= 'A' && (name.charAt(i))!= 'E' && (name.charAt(i))!= 'I'&& (name.charAt(i))!= 'O' && (name.charAt(i))!= 'U' )
       {
           Ccount++;
       }
    }
    System.out.println("Count of Consonant: " +Ccount);
    }
}


