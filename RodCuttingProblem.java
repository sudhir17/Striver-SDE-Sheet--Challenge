public static int cutRod(int price[], int n){

         int prev[]=new int[n+1];

         for(int i=0; i<=n; i++){

            prev[i]=i*price[0];

        }

        for(int ind=1; ind<n; ind++){

            for(int length=0; length<=n; length++){

                int notTake=0+prev[length];

                int take=Integer.MIN_VALUE;

                int rodLength=ind+1;

                if(rodLength<=length){

                    take=price[ind]+prev[length-rodLength];

                }

                prev[length]=Math.max(notTake,take);   

            }

        }

         return prev[n];

     }

    //by tabulation t.c.->o(n*n), s.c ->o(n*n)

   /* public static int cutRod(int price[], int n){

        int dp[][]=new int[n][n+1];

        for(int row[] : dp){

            Arrays.fill(row,-1);

        }

        //base case

        for(int i=0; i<=n; i++){

            dp[0][i]=i*price[0];

        }

        for(int ind=1; ind<n; ind++){

            for(int length=0; length<=n; length++){

                int notTake=0+dp[ind-1][length];

                int take=Integer.MIN_VALUE;

                int rodLength=ind+1;

                if(rodLength<=length){

                    take=price[ind]+dp[ind][length-rodLength];

                }

                dp[ind][length]=Math.max(notTake,take);   

            }

        }

         return dp[n-1][n];

    }*/

    //by memoization

   /* public static int f(int ind, int N, int price[],int dp[][]){

        if(ind==0){

            return N*price[0];

        }

        if(dp[ind][N]!=-1)return dp[ind][N];

        int notTake=0+f(ind-1,N,price,dp);

        int take=Integer.MIN_VALUE;

        int rodLength=ind+1;

        if(rodLength<=N){

            take=price[ind]+f(ind,N-rodLength,price,dp);

        }

        return dp[ind][N]=Math.max(notTake,take);

    }

    public static int cutRod(int price[], int n) {

        // Write your code here.

        int dp[][]=new int[n][n+1];

        for(int row[] : dp){

            Arrays.fill(row,-1);

        }

        return f(n-1,n,price,dp);

    }*/
