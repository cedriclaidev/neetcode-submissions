class Solution {
    // T: O(n), S: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        // [3, 4, 5, 6] -> {3: 0, 4: 1, 5: 2, 6: 3}
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (valueToIndexMap.containsKey(diff)) {
                return new int[]{valueToIndexMap.get(diff), i};
            }
            valueToIndexMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
