#User function Template for python3

class Solution:
    def productExceptSelf(self, nums):
        #code here
        isZero=0
        product=1
        for i in nums:
            if i !=0:
                product*=i
            else:
                isZero+=1
        ans=[]
        for i in range(0,len(nums)):
            if(isZero>1):
                ans.append(0)
            elif(isZero==1 and nums[i]!=0):
                ans.append(0)
            elif isZero==1 and nums[i]==0:
                ans.append(product)
            else:
                ans.append(int(product/nums[i]))
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        n = int(input())
        arr = [int(x) for x in input().split()]

        ans = Solution().productExceptSelf(arr)
        print(*ans)

# } Driver Code Ends