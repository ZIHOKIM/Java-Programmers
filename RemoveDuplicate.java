import java.util.*;
class RemoveDuplicate{
    public static void main(String[] args) {
        String str = "hello";
        String[] ch = str.split("l|o");
        System.out.println(Arrays.toString(ch));
        String result = "";
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            if(set.add(c)){
                result += c; 
            }
        }
        System.out.println(result);
    }
}