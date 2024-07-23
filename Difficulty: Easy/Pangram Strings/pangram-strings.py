#User function Template for python3
class Solution:
	def isPanagram(self, S):
		# code here
		d=set(chr(i) for i in range(65,91))
		s=S.upper()
		for ch in s:
		    if(ch in d):
		        d.remove(ch)
		    if not d:
		        return 1
		if not d:
		    return 1
		return 0

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		S = input()
		ob = Solution()
		answer = ob.isPanagram(S)
		print(answer)

# } Driver Code Ends