class Solution:
    def canSplit(self, arr):
        #code here
        total=sum(arr)
        lsum=0
        rsum=total
        for i in range(0,len(arr)):
            lsum+=arr[i]
            rsum-=arr[i]
            if(lsum==rsum):
                return True
        return False


#{ 
 # Driver Code Starts
if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().splitlines()

    t = int(data[0])
    index = 1
    for _ in range(t):
        arr = list(map(int, data[index].split()))
        index += 1

        obj = Solution()
        res = obj.canSplit(arr)
        if (res):
            print("true")
        else:
            print("false")

# } Driver Code Ends