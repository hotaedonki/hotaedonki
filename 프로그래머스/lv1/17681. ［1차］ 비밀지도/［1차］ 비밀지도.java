class Solution {
    public String[] solution(int n, int[] arr, int[] arr2) {
    int repeat = 0;
	StringBuilder sb = new StringBuilder();
	String[] str = new String [n];
	String[] str2 = new String [n];
	String[] answer = new String[n];
		for(int i = 0; i < n; i++) {
			if(arr[i] < (int) Math.pow(2, n-1)) {
				repeat = n - Integer.toBinaryString(arr[i]).length();
				for(int j = 0; j < repeat; j++) {
					sb.append("0");
				}
				sb.append(Integer.toBinaryString(arr[i]));
				str[i] = sb.toString();
				sb = new StringBuilder();
			}
			else str[i] = Integer.toBinaryString(arr[i]);
			
			if(arr2[i] < (int) Math.pow(2, n-1)) {
				repeat = n - Integer.toBinaryString(arr2[i]).length();
				for(int j = 0; j < repeat; j++) {
					sb.append("0");
				}
				sb.append(Integer.toBinaryString(arr2[i]));
				str2[i] = sb.toString();
				sb = new StringBuilder();
			}
			else str2[i] = Integer.toBinaryString(arr2[i]);	
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(str[i].charAt(j) == '1' || str2[i].charAt(j) == '1') {
					sb.append("#");
				}
				else {
					sb.append(" ");
				}
			}
			answer[i] = sb.toString();
			sb = new StringBuilder();
		}
        return answer;
    }
}