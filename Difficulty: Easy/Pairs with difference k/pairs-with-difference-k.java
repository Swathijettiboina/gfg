//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.countPairsWithDiffK(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        // Arrays.sort(arr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int val: arr){
            map.put(val,map.getOrDefault(val,0)+1);
            
        }
        int count=0;
        for(int val: arr){
            int rem=k+val;
            if(map.containsKey(rem)){// && map.get(val)>0 && map.get(rem)>0){
                // map.put(val,map.get(val)-1);
                // map.put(rem,map.get(rem)-1);
                count+=map.get(rem);
            }
        }
        return count;
    }
}