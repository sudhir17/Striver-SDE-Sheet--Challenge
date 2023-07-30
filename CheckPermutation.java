import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        if(str1.length()!=str2.length())
            return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<str2.length();i++)
        {
            arr1[str1.charAt(i)-'a']++;
            arr2[str2.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1, arr2))
            return true;
        else 
            return false;
    }
}
