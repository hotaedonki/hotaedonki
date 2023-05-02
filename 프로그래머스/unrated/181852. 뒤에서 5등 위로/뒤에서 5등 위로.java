import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        Arrays.sort(num_list);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num_list.length; i++){
            int a = num_list[i];
            list.add(a);   
        }
        for(int i = 0; i < 5; i++)
            list.remove(0);
        return list;
    }
}