class Solution {
    public static int lengthOfLongestSubstring(String s) {

    if (s == null || s.isEmpty()) {
        return 0;
    }

    Set<Character> set = new HashSet<>();

    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < s.length(); right++) {

        char current = s.charAt(right);

        // Shrink while duplicate exists
        while (set.contains(current)) {
            set.remove(s.charAt(left));
            left++;
        }

        // Add current character
        set.add(current);

        // Update maximum length
        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
}
}
