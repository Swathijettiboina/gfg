//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
             
            System.out.println(ob.getCrazy(S));
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution{
    static String getCrazy(String s)
    {
        //Your code here
        StringBuilder ans=new StringBuilder("");
        if(Character.isLowerCase(s.charAt(0))){
            ans.append(s.charAt(0));
            for(int i=1;i<s.length();i++){
                if(i%2!=0){
                    ans.append(Character.toUpperCase(s.charAt(i)));
                }else{
                    ans.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }else{
            ans.append(s.charAt(0));
            for(int i=1;i<s.length();i++){
                if(i%2!=0){
                    ans.append(Character.toLowerCase(s.charAt(i)));
                }else{
                    ans.append(Character.toUpperCase(s.charAt(i)));
                }
            }
        }
        return ans.toString();
    }
}