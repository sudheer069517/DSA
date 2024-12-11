public class LongestPalindromSubstring {

    // Leetcode - 5
    public String longestPalindrome(String s) {

        String palindrom = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String input = s.substring(i, j);
                if(isPalindrom(input) && input.length() > palindrom.length()){
                    palindrom = input;
                }
            }
        }

        return palindrom;
    }

    private boolean isPalindrom(String input){

        int i = 0;
        int j = input.length();
        while(i < j){
            if(input.charAt(i) != input.charAt(j-1))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        LongestPalindromSubstring longestPalindromSubstring = new LongestPalindromSubstring();
        String palindromSubString = longestPalindromSubstring.longestPalindrome("a");
        System.out.println(palindromSubString);

    }
}
