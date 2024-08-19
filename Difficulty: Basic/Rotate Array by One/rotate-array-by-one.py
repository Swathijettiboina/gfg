#User function Template for python3

class Solution:
    def rotate(self, arr):
        if len(arr)==1:
            return arr
        else:
            temp=arr[len(arr)-1]
            for i in range(len(arr)-1,0,-1):
                arr[i]=arr[i-1]
            arr[0]=temp
        return arr
    



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while t > 0:
        arr = list(map(int, input().split()))
        ob = Solution()
        ob.rotate(arr)
        print(" ".join(map(str, arr)))
        t -= 1

# } Driver Code Ends