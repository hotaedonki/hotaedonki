class Solution {
    public String solution(String my_string) {
        String result = "";
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= (char)97)
                result += my_string.substring(i,i+1).toUpperCase();
            else
            	result += my_string.substring(i,i+1).toLowerCase();
        }return result;
    }
}