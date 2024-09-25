class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numTotal = 0; // 분자
        int denoTotal = 0; // 분모
        int sameNum = 0; // 약분 할 공통 수
        
        numTotal = (numer1 * denom2) + (numer2 * denom1);
        denoTotal = denom1 * denom2;
		
        for (int i = 1; i <= numTotal && i <= denoTotal; i++) {
            if (numTotal % i == 0 && denoTotal % i == 0) {
                sameNum = i; // 나머지가 모두 0으로 나눠떨어지는 수로 약분
            }
        }
		
        int[] answer = {numTotal / sameNum, denoTotal / sameNum};
		
        return answer;
    }
}