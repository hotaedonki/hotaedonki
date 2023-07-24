import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = new int [2];
        Set<String> check = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            if (i > 0 && (words[i - 1].charAt(words[i - 1].length() - 1) 
                    != words[i].charAt(0) || check.contains(words[i]))) {
                result[0] = (i % n) + 1;
                result[1] = (i / n) + 1;
                break;
            }
            check.add(words[i]);
        }
        return result;
    }
}