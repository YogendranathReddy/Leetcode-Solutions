class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        updated_list = []
        for i in nums:
            if i not in updated_list:
                updated_list.append(i)
        n = len(updated_list)
        for i in range(n):
            nums[i] = updated_list[i]

        return n
