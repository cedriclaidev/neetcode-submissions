class Solution {
    // T: O(n) S: O(1)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // using an array to track the frequency of each letter's occurance
        // instead of a hashmap since we got limited 26 letters
        int[] freqArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // for char in string s, add 1
            // for chart in string t, minus 1
            // if they have the same occurance of the same letter it should end up being 0
            freqArray[s.charAt(i) - 'a']++;
            freqArray[t.charAt(i) - 'a']--;
        }
        for (int freq : freqArray) {
            if (freq != 0) {
                return false;
            }
        }
        return true;
    }
}
