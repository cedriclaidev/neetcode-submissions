class Solution {
    public int[] productExceptSelf(int[] nums) {
        // T: O(n); S: O(1)
        // if there're 2 or more zeros, the result will only contains zeros 
        // if there's 1 zero, only the zero index has non-zero product of all other elements
        int prod = 1, zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroCount++;
            }
        }
        
        if (zeroCount >= 2) {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                res[i] = nums[i] == 0 ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
