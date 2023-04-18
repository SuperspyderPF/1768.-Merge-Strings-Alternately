class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int len = Math.min(word1.length(), word2.length());
        for(int i = 0; i < len; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        result.append(word1.substring(len)).append(word2.substring(len));
        return result.toString();
    }
}
