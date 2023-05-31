public class OddEvenCount {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            int odd = 0;
            int even = 0;
            for(int i = 0; i < num_list.length; i++){
                if(num_list[i]%2 == 0){
                    even++;
                }else{
                    odd++;
                }

            }
            answer[0] = even;
            answer[1] = odd;
            return answer;
        }

        public int[] solution2(int[] num_list) {
            int[] answer = {};
            for(int i = 0; i < num_list.length; i++){
                answer[num_list[i]%2]++;
            }
            return answer;
        }
    }
}
