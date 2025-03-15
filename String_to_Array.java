package string_to_array;

import java.util.Arrays;
import java.util.Scanner;

public class String_to_Array 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.next();
		char arr[] = new char[st.length()];
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch = st.charAt(i);
			arr[i] = ch;
		}
		System.out.println(Arrays.toString(arr));
	}
}
