class Solution {
    public int solution(String myString, String pat) {
        int len = pat.length();
		int count = 0;
		for(int i = 0; i < myString.length() - len + 1; i++) {
			if(myString.substring(i, i+len).equals(pat))
				count++;
			else continue;
		}
        return count;
    }
}