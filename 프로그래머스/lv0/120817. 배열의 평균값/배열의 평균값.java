class Solution {
    public double solution(int[] numbers) {
        double result = 0.0;
        for(int i = 0; i<numbers.length; i++){
            result = (double)numbers[i] + result;
        }
        return result/numbers.length;
    }
}