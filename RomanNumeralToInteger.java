public class Solution {public static int romanToInt(String s) { 
                 int answer=0;  
                       int i=0; 
                              while(i<s.length()-1)
                              {
                                              if(getValue(s.charAt(i))<getValue(s.charAt(i+1)))  
                                                        { 
                                                             answer=answer-getValue(s.charAt(i))+getValue(s.charAt(i+1));  
                                                                        i=i+2; 
                                                                                   }       
                                                                                        else if(getValue(s.charAt(i))>=getValue(s.charAt(i+1)))
                                                                                        {        
                                                                                                    answer=answer+getValue(s.charAt(i));        
                                                                                                            i++;           
                                                                                         }    
                                                                                         
                                                                                    }     
                                                                                    
                                                                                      if(i==s.length()-1)       
                                                                                      
                                                                                           answer=answer+getValue(s.charAt(i));       
                                                                                               return answer; 
                                                                                               }
                                                                                               
                                                                                               
                                                                                                   static int  getValue(char c){     
                                                                                                      if(c=='I')       
                                                                                                           return 1;      
                                                                                                             else if(c=='V')          
                                                                                                               return 5;       
                                                                                                                else if(c=='X')   
                                                                                                                         return 10;   
                                                                                                                              else if(c=='L')       
                                                                                                                                   return 50;      
                                                                                                                                     else if(c=='C')         
                                                                                                                                        return 100;      
                                                                                                                                          else if(c=='D')    
                                                                                                                     return 500;     
                                                                                                                        else          
                                                                                                                           return 1000;   
                                                                                                                            }
}
