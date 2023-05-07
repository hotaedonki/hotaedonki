class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] arr = my_string.split("");
        String[] arr2 = overwrite_string.split("");
        
        String result = "";
        
        for(int i = 0; i < s; i++){
            result += arr[i];
        }
        for(int i = 0; i < overwrite_string.length(); i++){
            result += arr2[i];
        }
        for(int i = s + overwrite_string.length(); i < my_string.length(); i++){
            result += arr[i];
        }
        return result;
    }
}