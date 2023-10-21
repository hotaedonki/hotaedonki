import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
		
		for(String p : participant) {
			map.put(p, map.getOrDefault(p, 0) + 1);
		}
		
		for(String c : completion) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
			}
		}
		
		String answer = "";
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue() > 0) {
				return m.getKey();
			}
		}
		
		return "";
    }
}