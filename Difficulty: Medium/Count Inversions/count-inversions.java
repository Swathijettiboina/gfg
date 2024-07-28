//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for (long i = 0; i < n; i++) arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int)n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        // if(n<1){
        //     return -1;
        // }
        if(n<2){
            return 0;
        }
        long[] temp=new long[n];
        
        return mergesortAndCount(arr,temp,0,n-1);
    }
    static long mergesortAndCount(long[] arr, long[] temp,int left,int right){
        long count=0;
        int mid;
        if(left<right){
            mid=(int)(left+right)/2;
            count+=mergesortAndCount(arr,temp,left,mid);
            count+=mergesortAndCount(arr,temp,mid+1,right);
            count+=mergesort(arr,temp,left,mid,right);
        }
        return count;
    }
    static long mergesort(long[] arr,long[] temp,int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=left;
        long count=0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                count+=mid+1-i;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        for(int l=left;l<=right;l++){
            arr[l]=temp[l];
        }
        return count;
    }
}