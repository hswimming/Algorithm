function solution(n) {
    var answer = 0;
    var num = 1;
    
    for (let i = 1; i <= 10; i++) {
        num *= i; // 팩토리얼을 반대로 (작은 수 부터 더해서 곱하기)
        
        if (n == num) {
            answer = i;
            break;
        } else if (n <= num) {
            answer = i - 1; // 최대 팩토리얼의 이전 수가 되도록
            break; // 최대 팩토리얼이 n보다 클 경우 탈출
        }
    }
    
    return answer;
}