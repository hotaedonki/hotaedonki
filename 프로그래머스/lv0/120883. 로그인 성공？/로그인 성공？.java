class Solution {
    public String solution(String[] id, String[][] db) {
        int idCheck = 0;
        int pwCheck = 0;
        String answer = "";
        for(int j = 0; j < db.length; j++) {
			if(id[0].equals(db[j][0])) idCheck++;
			if(id[0].equals(db[j][0]) && id[1].equals(db[j][1])) pwCheck++;
        }
        if(idCheck == 1 && pwCheck == 1) answer = "login";
        else if(idCheck == 0) answer = "fail";
        else answer = "wrong pw";
        return answer;
    }
}