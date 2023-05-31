import java.util.Arrays;

public class JadenCase {
    public String solution1(String s) {
        String[] words = s.split(" ");
        String answer = "";

        for(String word : words){
            if(!word.equals("")){
                String first = word.substring(0,1);
                String finishWord = first.toUpperCase() + word.substring(1).toLowerCase();
                answer += finishWord +" ";
            }else{
                answer += " ";
            }

        }

        String result = "";
        if(s.substring(s.length()-1,s.length()).equals(" ")){
            result =  answer;
        }else{
            result =  answer.substring(0, answer.length()-1);
        }

        return result;

    }

    public String solution2(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for(int i = 0; i < sb.length() - 1; i++){
            if(sb.charAt(i) == ' ' && sb.charAt(i+1) != ' '){
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
            }
        }

        return sb.toString();
    }

    public String solution3(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }

    class Solution {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder(s);
            int index = 0;
            while(index < s.length()){

                while(index<s.length() && s.charAt(index) == ' ') index++;
                if(index < s.length()){
                    char ch =  Character.toUpperCase(s.charAt(index));
                    sb.setCharAt(index, ch);
                }index++;

                while(index<s.length() && s.charAt(index) != ' '){
                    char ch =  Character.toLowerCase(s.charAt(index));
                    sb.setCharAt(index, ch);
                    index++;
                }
            }

            return sb.toString();
        }
    }
}
