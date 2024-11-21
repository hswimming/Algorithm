function solution(n) {
    var answer = 0;
    
    for (let i = n; 1 <= i; i--) {
        answer += (n % i == 0) ? i : 0;
    }
    
    return answer;
}