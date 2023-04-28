import java.util.Arrays;

class StringCalculation{
    public static void main(String[] args) {
        String str = "3 + 1 + 4 + 6 - 10";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1;i<arr.length;i++){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        System.out.println(answer);
    }
} 