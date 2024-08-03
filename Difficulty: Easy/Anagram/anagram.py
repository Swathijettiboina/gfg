#User function Template for python3


class Solution:
    
    #Function is to check whether two strings are anagram of each other or not.
    def isAnagram(self,a,b):
        #code here
        if(len(a)!=len(b)):
            return False
        ans=dict()
        for char in a:
            if(char not in ans):
                ans[char]=1
            else:
                ans[char]+=1
            
        for char in b:
            if(char not in ans):
                return False
            ans[char]-=1
            if(ans[char]<0):
                return False
        return True


            # if(d.containsKey(char)):
                


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        a,b=map(str,input().strip().split())
        if(Solution().isAnagram(a,b)):
            print("YES")
        else:
            print("NO") 
# } Driver Code Ends