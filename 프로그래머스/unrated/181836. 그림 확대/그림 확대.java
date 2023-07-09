import java.util.*;

class Solution {
    public ArrayList solution(String[] p, int k) {
        int cnt = 0;
        int cntList = 0;
        ArrayList<String> list = new ArrayList<String>();
        String answer = "";
        for(int i = 0; i < p.length; i++) {
            for(int j = 0; j < p[i].length(); j++) {
                while(cnt != k) {
                    answer += p[i].charAt(j);
                    cnt++;
                }
                cnt = 0;
            }
            while(cntList != k) {
                list.add(answer);
                cntList++;
            }
            cntList = 0;
            answer = "";
        }
        return list;
    }
}