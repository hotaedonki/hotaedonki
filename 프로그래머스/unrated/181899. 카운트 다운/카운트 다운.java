class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        for(int i = answer.length-1; start >= end; i--){
            answer[i] = end++;
        }
        return answer;
    }
}