class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        input_string = ""
        for i in range(len(digits)):
            input_string += str(digits[i])

        n = int(input_string) + 1
        result_string = str(n)

        result_list = []

        for i in result_string:
            result_list.append(int(i))
    
        return result_list
