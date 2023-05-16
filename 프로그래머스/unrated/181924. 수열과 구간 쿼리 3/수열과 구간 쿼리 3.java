class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int idx = 0;
        for(int i = 0; i < queries.length; i++) {
	    		idx = arr[queries[i][0]];
    			arr[queries[i][0]] = arr[queries[i][1]];
    			arr[queries[i][1]] = idx;
	    	}
        return arr;
    }
}