import java.util.HashSet;

public class LongestSubstring {
    
    public static String longestSubstringWithoutRepeating(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int left = 0; 
        int maxLength = 0;  
        String longestSubstr = ""; 
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++; 
            }
            
            set.add(s.charAt(right));
            
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longestSubstr = s.substring(left, right + 1); 
            }
        
        }
        return longestSubstr;
    }
    

    public static void main(String[] args) {
        String s = "abcabcdabbbcc";
        
        String result = longestSubstringWithoutRepeating(s);
        
        System.out.println("Longest substring without repeating characters: " + result);
        System.out.println("Length of the longest substring: " + result.length());
    }
}