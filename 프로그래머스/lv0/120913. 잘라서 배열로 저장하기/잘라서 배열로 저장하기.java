class Solution {
    public String[] solution(String my_str, int n) {
        int j = n;
		int len = 0;
		if(my_str.length() % n == 0)
			len = my_str.length() / n;
		else len = my_str.length() / n + 1;
		String[] answer = new String [len];
			for(int i = 0; i < answer.length; i++) {
				if(n > my_str.length())
					answer[i] = my_str.substring(n - j);
				else {
					answer[i] = my_str.substring(n - j, n);
					n += j;
				}
			}
        return answer;
    }
}