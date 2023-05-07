class Solution {
    public String[] solution(String[] strArr) {
        String answer = "";
        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 0){
                answer = strArr[i];
                answer = answer.toLowerCase();
                strArr[i] = answer;
                answer = "";
            }
            else {
            answer = strArr[i];
            answer = answer.toUpperCase();
            strArr[i] = answer;
            answer = "";
            }
        }return strArr;
    }
}