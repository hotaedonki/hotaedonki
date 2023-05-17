class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer();
        String answer = "";
	    	answer += my_string.substring(0,s);
	    	sb.append(my_string.substring(s,e+1)).reverse();
	    	answer = answer + sb;
	    	answer += my_string.substring(e+1);
	    	return answer;
        
        
    }
}