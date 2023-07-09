class Solution {
    public StringBuilder solution(String s) {
    StringBuilder sb = new StringBuilder();
	int cnt = -1;
	String[] str = s.split("");
	for(int i = 0; i < str.length; i++) {
		cnt++;
		if(str[i].equals(" ")) {
			sb.append(" ");
			cnt = -1;
		}
		else if(cnt % 2 == 0) sb.append((str[i]+"").toUpperCase());
		else sb.append((str[i]+"").toLowerCase());
    }
    return sb;
    }
}