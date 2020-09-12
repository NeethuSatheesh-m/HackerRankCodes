 /*Alice is taking a cryptography class and finding anagrams to be very useful.
  We consider two strings to be anagrams of each other if the first string's 
  letters can be rearranged to form the second string. In other words, both 
  strings must contain the same exact letters in the same exact frequency 
  For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
Alice decides on an encryption scheme involving two large strings where 
encryption is dependent on the minimum number of character deletions required
to make the two strings anagrams. Can you help her find this number?*/
/*
Sample Input:
---------------
cde
abc
Sample Output:
--------------
4

Explanation:
------------
We delete the following characters from our two strings to turn them into 
anagrams of each other:
Remove d and e from cde to get c.
Remove a and b from abc to get c.
We must delete 4 characters to make both strings anagrams, 
so we print 4 on a new line.*/
 import java.util.*;


public class Anagram{

 static int makeAnagram(String a, String b) {
        int count=0,i,j;
        char[] str1=a.toCharArray();
        char[] str2=b.toCharArray();
        int len1=a.length();
        int len2=b.length();
        java.util.Arrays.sort(str1);
        java.util.Arrays.sort(str2);
        for(i=0;i<len1;i++)
        {
            for(j=0;j<len2;j++)
            {
                if(str1[i]==str2[j])
                {
                    count=count+2;
                    str2[j]='1';
                    break;
                }     
            }
        }
        int result=(len1+len2)-count;
        return result;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str1=input.next();
        String str2=input.next();

        int result=makeAnagram(str1,str2);
        System.out.println("No of letters :"+result);

    }
}
