class Solution {
    public int solution(String[] baddling) {
        int cnt = 0;
		int answer = 0;
		for(int i = 0; i < baddling.length; i++) {
			if(baddling[i].contains("aya")) {
				cnt += 3;
			}
			if(baddling[i].contains("ye")) {
				cnt += 2;
			}
			if(baddling[i].contains("woo")) {
				cnt += 3;
			}
			if(baddling[i].contains("ma")) {
				cnt += 2;
			}
			if(cnt == baddling[i].length()) {
				answer++;
			}
			cnt = 0;
		}
        return answer;
    }
}