class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        // Remove non-alphanumeric characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str = str + Character.toLowerCase(ch);
            }
        }

        String rev = "";

        // Reverse the cleaned string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            return true;
        }

        return false;
    }
}