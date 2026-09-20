class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        // [3, 4, 5, 6] -> {3: 0, 4: 1, 5: 2, 6: 3}
        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if (indexMap.containsKey(secondNum)) {
                return new int[]{indexMap.get(secondNum), i};
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }
}
