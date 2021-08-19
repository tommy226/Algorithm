package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class HashPhoneBook {
    public static void main(String[] args) {
        String[] phoneBooks = {"123", "456", "789"};

        Solution solution = new Solution();
        System.out.println(solution.answer(phoneBooks));
    }

    static class Solution {
        public boolean answer(String[] phone_book) {
            boolean answer = true;
            Arrays.sort(phone_book);
            HashMap<String, String> hashMap = new HashMap<>();
            for (int i = 0; i<phone_book.length; i++) {
                hashMap.put(phone_book[i], phone_book[i]);  // 0 , 1 , 2
                for(int j = 0; j<phone_book[i].length(); j++){
                    String compare = phone_book[i].substring(0, j);
                    if(hashMap.get(compare) != null){
                        return false;
                    }
                }
            }
            return answer;
        }
    }
}