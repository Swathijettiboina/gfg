//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int col)
    {
        ArrayList<Integer> l=new ArrayList<>();
        int rmin=0, rmax=r-1;
            int cmin=0,cmax=col-1;
            int count=0;
            while(count<(r*col)){
                //top
                for(int c=cmin;c<=cmax && count<(r*col) ;c++){
                    l.add(matrix[rmin][c]);
                    count++;
                }
                rmin++;
                
                //right
                for(int row=rmin ;row<=rmax && count<(r*col) ;row++){
                    l.add(matrix[row][cmax]);
                    count++;
                }
                cmax--;
                
                //bottom
                for(int c=cmax ;c>=cmin && count<(r*col) ;c--){
                    l.add(matrix[rmax][c]);
                    count++;
                }
                rmax--;
                
                //left
                for(int row=rmax ;row>=rmin && count<(r*col) ;row--){
                     l.add(matrix[row][cmin]);
                    count++;
                }
                cmin++;
                
            }
            
            return l;
    }
}
