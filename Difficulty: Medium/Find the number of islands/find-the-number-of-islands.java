//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    helper(grid,i,j,r,c);
                    count++;
                }
            }
        }
        return count;
    }
    public static void helper(char[][] arr,int i,int j,int r,int c){
        if(i==-1|| j==-1|| i==r||j==c||arr[i][j]=='0'|| arr[i][j]=='2'){
            return;
        }else{
            arr[i][j]='2';
            helper(arr,i-1,j,r,c);
            helper(arr,i,j-1,r,c);
            helper(arr,i+1,j,r,c);
            helper(arr,i,j+1,r,c);
            helper(arr,i-1,j-1,r,c);
            helper(arr,i+1,j+1,r,c);
            helper(arr,i+1,j-1,r,c);
            helper(arr,i-1,j+1,r,c);
        }
    }
}