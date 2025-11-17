class Solution:
    def findErrorNums(self, nums):
        c = Counter(nums)
        print(c)
        ret = []
        for x in c:
            if c[x] == 2:
                ret.append(x)
                break
        
        for i in range(1, len(nums) + 1):
            if c.get(i) is None:
                ret.append(i)
                break
        
        return ret
