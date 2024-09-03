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
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.magicalString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String magicalString(String S){
        // code here
        Map<Character,Character> map=new HashMap<>();
        int last=123;
        for(int i=96;i<123;i++){
            map.put((char)i,(char)last);
            last--;
        }
        StringBuffer ans=new StringBuffer();
        for(char c : S.toCharArray()){
            ans.append(map.get(c));
        }
        return ans.toString();
    }
}