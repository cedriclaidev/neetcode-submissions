class Solution {
    // T: O(n) - n is nums's length
    // S: O(n)
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentCount = countMap.getOrDefault(currentNum, 0);
            if (currentCount == 1) {
                return true;
            }
            countMap.put(currentNum, currentCount + 1);
        }
        return false;
    }
}