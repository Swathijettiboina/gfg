//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public static void main(String args[])throws IOException
	{
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());   
        while(t-->0)
        {
            // long n = Long.parseLong(br.readLine().trim());
            int a[] = new int[10];
            
            String line = read.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            
            for (int i = 0; i < 10; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.findDuplicate(a));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public int findDuplicate(int A[])
    {
        // Your code goes here
        int ans=-1;
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1]){
                return A[i];
            }
        }
        return ans;
    }
}