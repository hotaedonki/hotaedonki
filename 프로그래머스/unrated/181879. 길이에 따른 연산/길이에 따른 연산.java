class Solution {
    public int solution(int[] num_list) {
        int num = 1;
        for(int i = 0; i<num_list.length; i++){
            if(num_list.length >= 11){
                num += num_list[i];
            }
            else {
                num *= num_list[i];
            }
        }
        if (num_list.length >= 11) num--;
        return num;
    }
}