class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x");
	            if(myString.substring(myString.length()-1).equals("x")){
		    	    int[] result = new int[answer.length + 1];
		    	    for(int i = 0; i < answer.length; i++) {
			    		result[i] = answer[i].length();
		            }
		    	    return result;
	            }
	            else {
	                int[] result = new int[answer.length];
	                for(int i = 0; i < answer.length; i++) {
			    		result[i] = answer[i].length();
		            }
	                return result;
	            }
    }
}