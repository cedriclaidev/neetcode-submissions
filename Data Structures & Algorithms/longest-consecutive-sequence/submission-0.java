class Solution {
    public int longestConsecutive(int[] nums) {
        // T: O(n) amortized S: O(n)
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int longestSequenceLength = 0;
        for (int num : numsSet) {
            if (numsSet.contains(num - 1)) {
                continue;
            }
            int length = 1;
            while (numsSet.contains(num + length)) {
                length++;
            }
            longestSequenceLength = Math.max(longestSequenceLength, length);
        }
        return longestSequenceLength;
    }
}
