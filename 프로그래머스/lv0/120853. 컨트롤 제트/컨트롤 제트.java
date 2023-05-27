class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
		int answer = 0;
		for(int i = 0; i < str.length; i++) {
				if(str[i].equals("Z"))
					answer -= Integer.valueOf(str[i - 1]);
				else answer += Integer.valueOf(str[i]);
		}
        return answer;
    }
}