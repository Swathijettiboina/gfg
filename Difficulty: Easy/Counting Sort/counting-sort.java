//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        Map<Character,Integer> map=new TreeMap<>();
        for(char c:arr.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder ans=new StringBuilder();
        for(Map.Entry<Character,Integer> m: map.entrySet()){
            char key=m.getKey();
            for(int i=0;i<m.getValue();i++){
                ans.append(Character.toString(key));
            }
            // ans.append(Character.toString(m.getKey()));
        }
        return ans.toString();
    }
}