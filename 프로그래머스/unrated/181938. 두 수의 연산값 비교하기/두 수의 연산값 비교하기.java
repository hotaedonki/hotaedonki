class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int ab2 = 2*a*b;
        
        return ab == ab2 ? ab : Math.max(ab, ab2);
    }
}
