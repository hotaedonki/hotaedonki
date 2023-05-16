class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean result = true;
	    boolean result2 = true;
	    	if(x1 | x2)
	    		result = true;
	    	else result = false;
	    	if(x3 | x4)
	    		result2 = true;
	    	else result2 = false;
	    	if(result & result2)
                return true;
            else return false;
    }
}