class Solution {
    public int solution(String my_string, String is_suffix) {
        for(int i = 0; i < my_string.length(); i++){
        if(my_string.substring(i, my_string.length()).startsWith(is_suffix)
          && my_string.substring(i, my_string.length()).equals(is_suffix))
            return 1;
        }
        return 0;
    }
}