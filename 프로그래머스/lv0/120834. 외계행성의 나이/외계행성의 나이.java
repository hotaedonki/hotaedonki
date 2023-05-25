class Solution {
    public String solution(int age) {
        String answer = String.valueOf(age);
		StringBuffer sb = new StringBuffer();
		char[] a = answer.toCharArray();
		for(int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] + 49);
			answer += a[i];
			sb.append(a[i]);
		}
        return sb.toString();
    }
}