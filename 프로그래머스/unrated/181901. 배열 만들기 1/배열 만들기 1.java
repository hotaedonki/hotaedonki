import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if((i >= k) && (i % k == 0)){
                list.add(i);
            }
        }
        return list;
        
    }
}