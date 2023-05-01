class Solution {
    public int solution(int n) {
        int a = 0;
        for(int answer = 0; answer <= n; answer++){
            if(answer % 2 == 0){
                a += answer;
            }
            else {
                continue;
            }
        }   
        return a;
           
    }
}