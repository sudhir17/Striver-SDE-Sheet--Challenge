import java.io.*;
import java.util.* ;

public class Solution {
    static int mod=(int)1e9;
    public static int modularExponentiation(int x, int n, int m) {
                long ans = 1;

        long xx = x;

        while(n>0){

        

            if(n%2 !=0){

                ans = ((ans)%m *(xx)% m ) %m;

                

            }

            xx = ((xx)%m *(xx)%m)%m;

            n= n>>1;

        

        }  

        return(int) (ans%m);
//   long ans = 1;
//         long pow = n;
//         while(pow>0){
//             if(pow%2==0){
//                 x = ((x)*(x))%m;
//                 pow = pow/2;
//             }else{
//                 ans = (ans*(x))%m;
//                 pow = pow-1;
//             }
//         }
//         return (int)ans;
            // x=x%m;
            // long nn=n;
            // long res=1;
            // while(nn>0)
            // {
            //     if(nn%2==0)
            //     {
            //         x=((x%m)*(x%m))%m;
            //         nn=nn/2;
            //     }
            //     else {
            //         res=((res%m)*(x%m))%m;
            //         nn=nn-1;
            //     }

            // }
            // return (int)((res%m)%m);
    }
}
