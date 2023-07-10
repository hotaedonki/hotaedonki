import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        double[] avg = new double [len];
        int[] answer = new int [len];
        Arrays.fill(answer, 1);
        for(int i = 0; i < len; i++) 
            avg[i] = ((double) score[i][0] + (double) score[i][1]) / 2.0;
        for(int i = 0; i < len; i++) 
            for(int j = 0; j < len; j++) 
                if(avg[i] < avg[j]) answer[i]++;
        
        return answer;
    }
}