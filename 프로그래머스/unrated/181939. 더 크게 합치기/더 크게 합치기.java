class Solution {
    public int solution(int a, int b) {
        String ab = "";
        String ba = "";
        int i, j;
        ab = (a + "") + (b + "");
        ba = (b + "") + (a + "");
        i = Integer.parseInt(ab);
        j = Integer.parseInt(ba);
        
        return i >= j ? i : j;
    }
}