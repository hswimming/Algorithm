class Solution {
    public int solution(int n) {
        int answer = 0;
		int pizza = 7; // 피자 1판에 7조각
		
		if (n % pizza == 0) {
			answer = n / pizza;
			
		} else {
			answer = n / pizza + 1;
		}
		
		return answer;
    }
}