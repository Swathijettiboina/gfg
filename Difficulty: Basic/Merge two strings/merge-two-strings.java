//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String word1, String word2)
    { 
        // code here
        StringBuffer s=new StringBuffer("");
        int n1=word1.length();
        int n2=word2.length();
        if(n1<=n2){
            for(int i=0;i<n1;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
            }
            s.append(word2.substring(n1));
        }else{
            for(int i=0;i<n2;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
            }
            s.append(word1.substring(n2));
        }
        return s.toString();
    }
} 