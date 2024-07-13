//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    static long fibSum(long n) {
        // code here
        if(n<=0){
            return -1;
        }
        long sum=1;
        int index=0;
        long a=0;
        long b=1;
        long c;
        if(n==0 || n==1){
            return n;
        }
        else{
            for(int i=2;i<=n;i++){
                c=(a+b)%1000000007;
                a=b;
                b=c;
               sum+=c;
            }
        }
        return sum%1000000007;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends