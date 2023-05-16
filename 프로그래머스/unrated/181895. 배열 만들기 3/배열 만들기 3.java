import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<Integer>();
	    	
	    	int a1 = intervals[0][0];
	    	int b1 = intervals[0][1];
	    	int a2 = intervals[1][0];
	    	int b2 = intervals[1][1];
	    	
	    	for(int i = a1; i < b1 + 1; i++) {
	    		list.add(arr[i]);
	    	}
	    	for(int i = a2; i < b2 + 1; i++) {
	    		list.add(arr[i]);
	    	}
        return list;
    }
}