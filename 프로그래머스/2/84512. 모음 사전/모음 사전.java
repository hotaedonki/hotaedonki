public class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] f = {781, 156, 31, 6, 1};
        char[] AEIOU = {'A', 'E', 'I', 'O', 'U'};
        
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (word.charAt(i) == AEIOU[j]) {
                    answer += 1 + j * f[i];
                }
            }
        }
        
        return answer;
    }
}