class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int right = n - 1, top = 0, left = 0, bottom = n - 1;
		int num = 1;
		while(num <= n*n) {
			for(int i = left; i <= right; i++) {
				arr[top][i] = num;
				num++;
			}
			top++;
			
			for(int i = top; i <= bottom; i++) {
				arr[i][right] = num;
				num++;
			}
			right--;
			
			for(int i = right; i >= left; i--) {
				arr[bottom][i] = num;
				num++;
			}
			bottom--;
			
			for(int i = bottom; i >= top; i--) {
				arr[i][left] = num;
				num++;
			}
			left++;
		}
        return arr;
        
        
    }
}