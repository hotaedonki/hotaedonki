class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len = arr1.length;
        int len2 = arr2.length;
        int sum = 0, sum2 = 0;
        if(len == len2)
            for(int i = 0; i < len; i++){
                sum += arr1[i];
                sum2 += arr2[i];
            }
        if(len > len2)
            return 1;
        if(len < len2)
            return -1;
        if(sum > sum2)
            return 1;
        else if (sum2 > sum)
            return -1;
        else return 0;
    }
}