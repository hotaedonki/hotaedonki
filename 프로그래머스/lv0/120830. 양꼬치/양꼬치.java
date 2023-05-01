class Solution {
    public int solution(int n, int k) {
        int price = 12000*n+2000*k;
        for (int i = 10; i <= n; i++){
            if (i % 10 == 0){
                price = price - 2000;
            }
            else {
                continue;
            }
        }return price;
    }      
}