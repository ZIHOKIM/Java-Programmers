public class CorrectBracket {
    public static void main(String[] args) {
        String s = "12345";
        boolean answer = true;

        for(int i =0; i<s.length();i++){
            if(s.substring(i,i+2) .equals("()")){
                i++;
            }else{
                System.out.printf(s.substring(i,i+2));
                answer = false;

                break;
            }
        }


    }
}
