class Solution {
    public String solution(String myString, String pat) {
        int a = myString.lastIndexOf(pat) + pat.length();
        String answer = "";
        answer += myString.substring(0, a);
        return answer;
        
    }
}