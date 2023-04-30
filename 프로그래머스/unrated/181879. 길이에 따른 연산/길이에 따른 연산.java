class Solution {
    public int solution(int[] num_list) {
        int num = 0;
            if(num_list.length >= 11) {
                for(int i = 0; i < num_list.length; i++){
                num += num_list[i];
                }
                return num;
            }
            else {
                num = 1;
                for(int i = 0; i < num_list.length; i++){
                num *= num_list[i];
            }
            return num;
        }
    }
 }
