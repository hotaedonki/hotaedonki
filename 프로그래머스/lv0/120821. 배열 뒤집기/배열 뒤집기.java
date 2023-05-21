import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = num_list.length - 1; i >= 0; i--) {
			list.add(num_list[i]);
		}
        return list;
    }
}