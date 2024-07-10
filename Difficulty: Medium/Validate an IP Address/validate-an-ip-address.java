//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        String[] ip=s.split("\\.");
        if(ip.length!=4){
            return false;
        }
        if(s.startsWith(".")||s.endsWith(".")){
            return false;
        }
        for(String c:ip){
            if(c.length()>3 || c.length()>1 && c.charAt(0)=='0'){
                return false;
            }
            try{
                int value=Integer.valueOf(c);
                if(!(value>=0 && value<=255)){
                    return false;
                }
            }catch(Exception e){
                return false;
            }
            
        }
        return true;
    }
}