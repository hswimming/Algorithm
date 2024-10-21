class Solution {
    public int solution(int[] numbers, int k) {
        // 공을 던진 위치 = (k - 1) * 2
        // (k - 1) * 2 하면 배열의 길이를 넘을 수 있기 때문에 배열의 길이로 나눈 나머지 값을 구하기
        
        int answer = 0;
        return answer = numbers[((k - 1) * 2) % numbers.length];
    }
}