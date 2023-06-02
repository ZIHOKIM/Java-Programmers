public class minMax {
    public String solution(String s) {

        String answer = "";
        String [] strNum = s.split(" ");
        int[] numbers = new int[strNum.length];
        int index = 0;

        for(String num :strNum){
            numbers[index] = Integer.parseInt(num);
            index++;
        }

        int temp = 0;
        for(int i = 0; i<numbers.length;i++){
            for(int j = 1;j<numbers.length-i;j++){
                if(numbers[j]<numbers[j-1]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j]= temp;
                }
            }
        }

        return answer = numbers[0]+" "+numbers[numbers.length-1];
    }
    public String solution2(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;

    }
}
