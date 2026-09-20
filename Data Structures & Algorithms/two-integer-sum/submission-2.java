class Solution {
    public int[] twoSum(int[] nums, int target) {
        // map each index to the value it needs to
        // sum up to target
        Map<Integer, Integer> indexMap = new HashMap<>(nums.length);
        // [3, 4, 5, 6] -> {3: 0, 4: 1, 5: 2, 6: 3}
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }
        for (int j = 0; j < indexMap.size(); j++) {
            int val = target - nums[j];
            if (indexMap.containsKey(val) && indexMap.get(val) != j) {
                return new int[]{j, indexMap.get(val)};
            }
        }
        return null;
    }
}
