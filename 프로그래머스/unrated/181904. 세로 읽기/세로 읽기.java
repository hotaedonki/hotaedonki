class Solution {
    public String solution(String my_string, int m, int c) {
        String result = "";
        int len = my_string.length();
	    	for(int i = 0; i < len; i += m) {
	    		result += my_string.charAt(c+i-1);
	    	}
	    	return result;
    }
}