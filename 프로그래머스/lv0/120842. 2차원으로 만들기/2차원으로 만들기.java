class Solution {
    public int[][] solution(int[] nl, int n) {
        int[][] result = new int [nl.length / n][n];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < n; j++) {
				result[i][j] = nl[(i * n) + j]; 
			}
		}
        return result;
    }
}