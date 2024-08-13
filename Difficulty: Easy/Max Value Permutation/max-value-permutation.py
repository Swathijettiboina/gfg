#User function Template for python3

class Solution:
    def Maximize(self, arr): 
        # Complete the function
        arr.sort()
        ans=0
        for i in range(len(arr)):
            ans+=arr[i]*i
        return ans%(pow(10,9)+7)
      



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        A = list(map(int, input().strip().split()))
        # k = int(input())
        ob = Solution()
        print(ob.Maximize(A))

# } Driver Code Ends