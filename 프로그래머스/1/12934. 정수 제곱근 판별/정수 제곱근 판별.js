function solution(n) {
    var answer = 0;
    
    for (i = 1; i <= n; i++) {
        if (i * i === n) {
            // 양의 정수의 제곱이면 (i + 1) 제곱 리턴
            answer = (i + 1) * (i + 1);
            break;
        } else {
            answer = -1;
        }
    }
    
    return answer;
}