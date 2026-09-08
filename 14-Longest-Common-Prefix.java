class Solution {
    public String longestCommonPrefix(String[] s) {
        for(int i = 0; i<s[0].length();i++) {
            for(int j = 1; j<s.length;j++) {
                if(i>=s[j].length()|| s[0].charAt(i) != s[j].charAt(i)) {
                    return s[0].substring(0,i);
                }

            }

        }
        return s[0];
       
        
    }
}