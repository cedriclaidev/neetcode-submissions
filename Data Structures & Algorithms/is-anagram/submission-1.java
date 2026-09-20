class Solution {
    // T: O(n) S: O(1)
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charToCountMap = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            charToCountMap.put(currentChar, charToCountMap.getOrDefault(currentChar, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            if (!charToCountMap.containsKey(currentChar)) {
                return false;
            }
            int count = charToCountMap.get(currentChar);
            if (count <= 0) {
                return false;
            }
            charToCountMap.put(currentChar, count - 1);
        }
        for (Map.Entry<Character, Integer> entry : charToCountMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
