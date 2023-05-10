class Solution {
    public String solution(String code) {
       int mode = 0;
    String ret = "";
    
    for (int i = 0; i < code.length(); i++) {
        char c = code.charAt(i);
        
        if (c == '1') {
            mode = 1 - mode;
        } else {
            if (mode == 0 && i % 2 == 0) {
                ret += c;
            } else if (mode == 1 && i % 2 == 1) {
                ret += c;
            }
        }
    }
    
    if (ret.isEmpty()) {
        return "EMPTY";
    } else {
        return ret;
    }
}
}