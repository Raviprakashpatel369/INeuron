import java.util.*;
public class Pangram { 
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter first String : ");
        String str =sc.nextLine().toLowerCase();
		sc.close();  
        boolean allLetterPresent = true;  
        for (char ch = 'a'; ch <= 'z'; ch++)   
        {  
            if (!str.contains(String.valueOf(ch)))   
            {  
                allLetterPresent = false;  
                break;  
            }  
        }  
        if (allLetterPresent)    
            System.out.println("Pangram String");  
        else  
            System.out.println("Not a Pangram String"); 

    }  
}  