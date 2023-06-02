class Solution {
    public int solution(int[] s) {
        int x = Math.max(s[0], s[1]);
		int y = Math.min(s[0], s[1]);
		int z = 0;
		int cnt = 0;
			while (true) {
				if(y + z <= x) z = x - y + 1;
				
				if(y + z > x || x + y < z) {
					z++;
					cnt++;
				}

				if(z == x + y) break;
			}
        return cnt;
    }
}