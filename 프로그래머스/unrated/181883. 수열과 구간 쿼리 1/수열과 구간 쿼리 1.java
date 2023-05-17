class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            int b = queries[i][1];
            int c = queries[i][0];
            for(int j = c; j <= b; j++){
	    		arr[j] += 1;
	    		}
            }
        return arr;
    }
}