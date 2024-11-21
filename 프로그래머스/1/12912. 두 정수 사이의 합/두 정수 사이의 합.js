function solution(a, b) {
    var answer = 0;
    
    // a가 b보다 작을 수 있으므로
    for (let i = Math.min(a, b); i <= Math.max(a, b); i++) {
        answer += i;
    }
    
    return answer;
}