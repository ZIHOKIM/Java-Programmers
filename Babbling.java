
class Solution {
    public int solution(String[] babbling) {
        
        int result = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            int wordCount = 0;
            String babblingWord = babbling[i]; 
            
            for(int j=0; j<words.length; j++){
                if(babblingWord.contains(words[j])){
                    wordCount += words[j].length();
                }
            }
            if(babblingWord.length() == wordCount){
                result++;
            }
        }
        return result;
    }
        
}