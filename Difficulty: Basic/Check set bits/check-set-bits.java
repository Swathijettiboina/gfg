//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isBitSet(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int isBitSet(int n){
        if(n==0){
            
        }
        //code here
        String s=Integer.toBinaryString(n);
        for(char c: s.toCharArray()){
            if(c=='0'){
                return 0;
            }
        }
        return 1;
    }
}