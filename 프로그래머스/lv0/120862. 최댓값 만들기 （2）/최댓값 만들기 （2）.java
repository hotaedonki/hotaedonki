import java.util.Arrays;
class Solution {
    public int solution(int[] n) {
        Arrays.sort(n);
        return Math.max(n[0]*n[1], n[n.length-2]*n[n.length-1]);
    }
}