class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            // Move left pointer until an alphanumeric character is found
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            // Move right pointer until an alphanumeric character is found
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            // If characters don't match (ignoring case), it's not a palindrome
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}