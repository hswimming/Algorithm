function solution(n) {
    var answer = [];
    
    // 0, 1은 소수에 포함 X, 제한사항에 n은 2이상의 수
    for (let i = 2; i <= n; i++) {
        // n이 나누어떨어지지 않을 때까지 소인수로 계속 나눔
        while (n % i == 0) {
            answer.push(i);
            n /= i;
        }
    }
    
    // 배열을 Set 객체로 변환 후 다시 배열로 변환하여 중복값 제거
    return answer = [...new Set(answer)];
}