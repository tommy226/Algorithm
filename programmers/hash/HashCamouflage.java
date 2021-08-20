package programmers.hash;

import java.util.HashMap;

public class HashCamouflage {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        Solution solution = new Solution();
        System.out.println(solution.answer(clothes));
    }

    static class Solution {
        public int answer(String[][] clothes) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            for(int i=0; i< clothes.length; i++){

                String key = clothes[i][1];
                System.out.println("key = " + key);

                hashMap.put(key, hashMap.getOrDefault(key,0) + 1);

                System.out.println("hashMap = " + hashMap.toString());
            }

            int answer = 1;                 // 곱셈을 위함

            for(String key : hashMap.keySet()){
                answer *= hashMap.get(key) + 1;
            }
            return answer - 1;
        }
    }
}
