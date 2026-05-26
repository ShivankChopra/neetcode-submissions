class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        let l = 0;
        let ans = 0;
        let win = new Set();

        for (let r = 0; r < s.length; r++) {
            while (win.has(s.charAt(r))) {
                win.delete(s.charAt(l));
                l++;
            }
            win.add(s.charAt(r));
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
