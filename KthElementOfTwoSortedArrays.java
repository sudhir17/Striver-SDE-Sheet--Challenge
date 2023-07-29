public class Solution {
    public static int ninjaAndLadoos(int a[], int b[], int m, int p, int l) {
        // Write your code here.
          int n=a.length+b.length;
        int res[]=new int[n];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
                res[k++]=a[i++];
            else 
                res[k++]=b[j++];
        }
        while(i<a.length)
            res[k++]=a[i++];
        while(j<b.length)
            res[k++]=b[j++];
        // double ans=0;
        // if(res.length%2==0)
        // {
        //     int len=res.length/2;
        //     ans=(res[len]+res[len-1])/2.0;
        // }
        // else 
        //     ans=res[res.length/2];
        return res[l-1];
    }
}
