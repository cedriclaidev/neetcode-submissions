class Solution {
    // T: O(n) - n is the length of nums
    // S: O(n) - n is the length of nums
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int diff = target - current;
            if (indexMap.containsKey(diff)) {
                return new int[] {indexMap.get(diff), i};
            }
            indexMap.put(current, i);
        }
        return new int[] {};
    }
}
