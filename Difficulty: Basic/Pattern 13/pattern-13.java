//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


// Back-end complete function Template for Java

class Solution {

    void printTriangle(int n) {
        int i=1;
        for(int c=1;c<=n;c++){
            for(int j=0;j<c;j++){
                System.out.print((i++)+" ");
            }
            System.out.println();
        }
    }
}