import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < intStrs.length; i++) {
	    	int answer = Integer.parseInt(intStrs[i].substring(s, s+l));
	    	if(answer > k)
	    		list.add(answer);
	    	else continue;
        }return list;
    }
}