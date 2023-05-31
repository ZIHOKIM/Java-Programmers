import java.util.Arrays;

class TriangleComplete {
    public int solution(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        int sum = sides[0]+sides[1];
        if(sides[2]>=sum){
            answer = 2;
        }
        return answer;
    }
}