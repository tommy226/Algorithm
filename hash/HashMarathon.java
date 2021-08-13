package hash;

import java.util.HashMap;

public class HashMarathon {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Solution solution = new Solution();
        System.out.println(solution.answer(participant, completion));
    }

    static class Solution {
        public String answer(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> name = new HashMap<>();
            for(String partiName : participant) {
                name.put(partiName, name.getOrDefault(partiName, 0) + 1);
            }
            for(String compleName : completion){
                name.put(compleName, name.get(compleName) -1);
            }
            for(String key : name.keySet()){
                if(name.get(key) != 0){
                    answer = key;
                }
            }
            return answer;
        }
    }
}


