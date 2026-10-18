class Solution {
    public int[] productExceptSelf(int[] nums) {
        // T: O(n); S: O(1)
        int[] res = new int[nums.length];

        // first pass: 
        // record the product of everything left to current element (prefix product)
        // e.g. [-1, 0, 1, 2, 3] -> [1, -1, 0, 0, 0]; [1, 2, 4, 6] -> [1, 1, 2, 8]
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // second pass: in reverse 
        // current prefix product times the product of everything right to the current element (suffix product)
        int suffixProd = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffixProd;
            suffixProd *= nums[i]; 
        }

        return res;
    }
}  
