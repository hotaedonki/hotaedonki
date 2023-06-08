class Solution {
    boolean solution(String s) {
        int pCnt = 0, yCnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i+1).equalsIgnoreCase("p")) pCnt++;
            else if(s.substring(i, i+1).equalsIgnoreCase("y")) yCnt++;
        }
        if(pCnt == yCnt) return true;
        else return false;
    }
}