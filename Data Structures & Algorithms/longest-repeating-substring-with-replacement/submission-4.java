class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        HashMap<Character, Integer> fmap = new HashMap<>();

        int L = 0;
        int maxFreq = 0;

        for (int R = 0; R < s.length(); R++) {
            fmap.put(s.charAt(R), fmap.getOrDefault(s.charAt(R), 0) + 1);
            maxFreq = Math.max(maxFreq, fmap.get(s.charAt(R)));

            while (R-L+1 - maxFreq > k) {
                fmap.put(s.charAt(L), fmap.get(s.charAt(L)) - 1);
                L++;
            }

            maxLen = Math.max(maxLen, R-L+1);
        }

        return maxLen;
    }
}
