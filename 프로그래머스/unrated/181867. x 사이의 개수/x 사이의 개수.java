class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x",myString.length());
        int[] result = new int [answer.length];
		    	    for(int i = 0; i < answer.length; i++) {
			    		result[i] = answer[i].length();
                    }
	                return result;
	            }
}