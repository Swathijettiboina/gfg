//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int n=nums.length;
        int target=n/3;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(val>target){
                ans.add(key);
            }
        }
        return ans;
    }
}
