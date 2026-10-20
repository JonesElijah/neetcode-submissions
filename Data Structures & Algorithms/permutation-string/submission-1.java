class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        // 1. Build the frequency map for s1
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int matched = 0; // Tracks how many unique characters match s1's requirements

        // 2. Slide the window across s2
        for (int r = 0; r < s2.length(); r++) {
            char rightChar = s2.charAt(r);

            // If the character belongs to s1, decrement its required count
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                // When frequency reaches 0, we have matched this exact character count requirement
                if (map.get(rightChar) == 0) {
                    matched++;
                }
            }

            // If our window size exceeds s1.length(), shrink it from the left
            if (r - l + 1 > s1.length()) {
                char leftChar = s2.charAt(l);
                if (map.containsKey(leftChar)) {
                    // If it was fully matched before, shrinking the window breaks the match
                    if (map.get(leftChar) == 0) {
                        matched--;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                l++; // Shrink the window
            }

            // If all unique characters from s1 are fully matched, we found a permutation!
            if (matched == map.size()) {
                return true;
            }
        }

        return false;
    }
}
