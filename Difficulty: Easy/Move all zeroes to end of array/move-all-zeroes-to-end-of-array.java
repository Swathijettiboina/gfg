//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] nums, int n) {
        // code here
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int index=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                ans[index++]=nums[i];
            }
        }
        while(index<n){
            ans[index++]=0;
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}