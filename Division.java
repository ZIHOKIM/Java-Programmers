class Division {
    public int solution(int num1, int num2) {
        int result = (int)Math.floor(((double)num1/(double)num2)*1000);
        return result;
    }
}