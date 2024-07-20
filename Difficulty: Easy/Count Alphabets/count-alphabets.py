#User function Template for python3

class Solution:

    def Count(self, s):
        # code here
        count=0
        for i in s:
            if(i.isalpha()):
                count+=1
        return count

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        S = input()

        solObj = Solution()

        print(solObj.Count(S))
# } Driver Code Ends