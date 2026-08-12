class Solution {
    //SatvikaKoneti
    public boolean isMatch(String s, String p) {

        return match(s, p, 0, 0);
    }

    boolean match(String s, String p, int i, int j) {

        // Pattern finished
        if(j == p.length()) {
            return i == s.length();
        }

        // Check whether current characters match
        boolean firstMatch = false;

        if(i < s.length() &&
           (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {

            firstMatch = true;
        }

        // If next character is '*'
        if(j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Option 1: use '*' for zero characters
            boolean zero = match(s, p, i, j + 2);

            // Option 2: use '*' for one/more characters
            boolean more = firstMatch && match(s, p, i + 1, j);

            return zero || more;
        }

        // Normal character / '.'
        return firstMatch && match(s, p, i + 1, j + 1);
    }
}