function solution(a, b, n) {
    var answer = 0;
    
    while (a <= n) {
        answer += Math.floor(n / a) * b; // 가지고 있는 빈 병 교환 시 콜라 개수
        n = (n % a) + Math.floor(n / a) * b; // 교환 후 남은 빈 병 + 콜라 개수
    }
    
    return answer;
}