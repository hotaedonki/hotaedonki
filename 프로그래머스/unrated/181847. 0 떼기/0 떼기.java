class Solution {
    public String solution(String n_str) {
        int count = 0;
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.substring(i, i+1).equals("0"))
                count++;
            else break;
        }
        return n_str.substring(count);
    }
}