class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;  // Pointer for word1
        int right = 0; // Pointer for word2
        StringBuilder sb = new StringBuilder();
        
        // Loop while both strings still have characters left
        while (left < word1.length() && right < word2.length()) {
            sb.append(word1.charAt(left++));
            sb.append(word2.charAt(right++));
        }
        
        // Append any remaining characters from word1
        if (left < word1.length()) {
            sb.append(word1.substring(left));
        }
        
        // Append any remaining characters from word2
        if (right < word2.length()) {
            sb.append(word2.substring(right));
        }
        
        return sb.toString();
    }
}
