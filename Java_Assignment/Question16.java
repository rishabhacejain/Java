package Java_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
	String Str1 = "topsint.com";
	String Str2 = "topsint.com";
	String Str3 = "Topsint.com";
	
	
	char[] array1 = Str1.toCharArray();
	char[] array2 = Str2.toCharArray();
	char[] array3 = Str3.toCharArray();
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	Arrays.sort(array3);
	
	String sortedarr1 =new String(array1);
	String sortedarr2 =new String(array2);
	String sortedarr3 =new String(array3);	
	
	
	System.out.println(sortedarr1.equals(sortedarr2));
	System.out.println(sortedarr1.equals(sortedarr3));

	}
}



