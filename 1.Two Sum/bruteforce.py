class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        length = len(nums)
        
        for i in range(length):
            for j in range(length-i):
                if(j != 0):
                    mySum = nums[i] + nums[i+j]
                    if(mySum == target):
                        return [i,i+j]