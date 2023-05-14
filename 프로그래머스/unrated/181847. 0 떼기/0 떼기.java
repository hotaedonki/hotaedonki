class Solution {
    public String solution(String n_str) {
        int count = 0;
        String answer = "";
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) == '0')
                count++;
            else break;
        }
        answer = n_str.substring(count, n_str.length());
        return answer;
    }
}