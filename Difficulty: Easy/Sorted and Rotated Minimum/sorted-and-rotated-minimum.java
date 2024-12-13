//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob = new Solution(); // Instantiate the Solution object once

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            System.out.println(ob.findMin(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
            // int i=1;
            for(int i=1;i<n-1;i++){
                if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                    return arr[i];
                }
            }
        return arr[0]<arr[n-1]?arr[0]:arr[n-1];
    }
}
