class Solution {
    public String solution(int n) {
        String watermelon = "";
        for(int i = 1; i < n + 1; i++){
            if(i % 2 == 0) watermelon += "박";
            else watermelon += "수";
        }
        return watermelon;
    }
}