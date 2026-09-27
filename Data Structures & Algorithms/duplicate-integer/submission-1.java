class Solution {
    // T: O(n) - n is nums's length
    // S: O(n)
    // Use a hashset instead of a hashmap
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> seenSet = new HashSet<>();
        for (int num : nums) {
            if (seenSet.contains(num)) {
                return true;
            }
            seenSet.add(num);
        }
        return false;
    }
}