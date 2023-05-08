class Solution {
    public int solution(String myString, String pat) {
        String result = myString.toUpperCase();
        String result2 = pat.toUpperCase();
        if(result.contains(result2))
            return 1;
        else 
            return 0;
    }
}