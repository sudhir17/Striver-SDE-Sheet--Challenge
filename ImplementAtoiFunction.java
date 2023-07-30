import java.util.* ;
import java.io.*; 
public class Solution {
    public static int atoi(String s) {               int ans=0;        for(int i=0;i<s.length();i++){            if(s.charAt(i)-'0'<0||s.charAt(i)-'0'>9)                continue;        else{              ans=ans*10+s.charAt(i)-'0';          }}        if(s.charAt(0)=='-')            return -ans;  return ans;  }

}
