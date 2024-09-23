class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numTotal = 0;
		int denoTotal = 0;
		int sameNum = 0;
        
        numTotal = (numer1 * denom2) + (numer2 * denom1);
		denoTotal = denom1 * denom2;
		
		for (int i = 1; i <= numTotal && i <= denoTotal; i++) {
			if (numTotal % i == 0 && denoTotal % i == 0) {
				sameNum = i;
			}
		}
		
		int[] answer = {numTotal / sameNum, denoTotal / sameNum};
		
		return answer;
    }
}