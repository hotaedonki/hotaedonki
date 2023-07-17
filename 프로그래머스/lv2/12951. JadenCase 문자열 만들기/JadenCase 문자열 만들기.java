class Solution {
    public StringBuilder solution(String s) {
    StringBuilder sb = new StringBuilder();
	sb.append(s);
    sb.replace(0, 1, s.toUpperCase().charAt(0)+"");
	for(int i = 1; i < sb.length(); i++) {
		if(sb.charAt(i) != ' ' && sb.charAt(i-1) == ' ') {
			sb.replace(i, i+1, s.toUpperCase().charAt(i)+"");
		}
        else sb.replace(i, i+1, s.toLowerCase().charAt(i)+"");
	}
        return sb;
    }
}