//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int nums1[], int nums2[]) 
    {
        // Your Code Here
        List<Integer> set=new ArrayList<>();
        for(int val: nums1){
            set.add(val);
        }
        for(int val: nums2){
            set.add(val);
        }
        Collections.sort(set);
        int k=set.size();
        int[] arr=new int[k];
        int index=0;
        for(int val: set){
            arr[index++]=val;
        }
        if(k%2!=0){
            return arr[(int)(k/2)];
        }
        int val1=arr[(int)k/2-1];
        int val2=arr[(int)k/2];
        return ((double) val1 + (double) val2) / 2.0;
    }
}