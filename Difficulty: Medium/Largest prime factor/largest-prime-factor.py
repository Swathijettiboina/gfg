#User function Template for python3
from math  import sqrt
class Solution:
    def largestPrimeFactor (self, n):
        # code here
        last=-1
        while(n%2==0):
            last=2
            n=n/2
        for i in range(3,int(sqrt(n))+1,2):
            while(n%i ==0):
                last=i
                n=n/i
        if(n>2):
            return int(n)
        return int(last)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
       

        ob = Solution()
        print(ob.largestPrimeFactor(N))
# } Driver Code Ends