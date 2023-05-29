import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        int n = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a : arr) list.add(a);
		while (true) {
            if(arr.length == 1)
                break;
			n = n * 2;
			if(list.size() < n) while(list.size() != n) list.add(0);
			if(list.size() == n) break;
		}
        return list;
    }
}