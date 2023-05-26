class Solution {
    public int solution(int n) {
        int answer = 0, result = 0;
		for(int i = 1; i < n + 1; i++) {
			answer = 0;
			for(int j = 1; j < n + 1; j++) {
				if(i % j == 0) {
					answer++;
					if(answer >= 3) {
						result++;
						break;
					}
				}
			}
		}return result;
    }
}