class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        n = len(nums)
        num = set()
        for i in range(n):
            if nums[i] in num:
                return True
            num.add(nums[i])

        return False
