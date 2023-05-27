import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
		String str = "";
		for(int a = i; a <= j; a++) {
			str += a+"";
		}
		return str.replaceAll("[^" + k + "]", "").length();
    }
}