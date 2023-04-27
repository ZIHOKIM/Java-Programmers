class SumFraction {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = (numer1 * denom2) + (numer2 * denom1);
        int bottom = denom1 * denom2;
        
        int[] answer = new int[2];
        
        for(int i=1; i<=bottom && i<=top; i++){
            if(top%i==0&&bottom%i==0){
                answer[0] = top/i;
                answer[1] = bottom/i;
            }
        }
        
        return answer;
    }
}