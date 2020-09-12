import java.io.*;
import java.util.*;
public class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.next();
		String st2=sc.next();
		char[] str1=st1.toCharArray();
		char[] str2=st2.toCharArray();
		int len1=st1.length();
		int len2=st2.length();

		if(len1!=len2)
			System.out.println("no");
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0;i<len1;i++)
			if(str1[i]!=str2[i])
				System.out.println("no");

		//System.out.println("yes");

	}
}