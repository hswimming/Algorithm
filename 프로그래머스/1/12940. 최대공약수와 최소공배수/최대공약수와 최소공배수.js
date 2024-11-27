function solution(n, m) {
    var answer = [];
    var gcd = 0; // 최대공약수
    
    for (let i = 1; i <= m; i++) {
        if (n % i === 0 && m % i === 0) {
            gcd = (gcd < i) ? i : gcd;
        }
    }
    
    // 최소공배수 => 두 수를 곱한 값을 최대공약수로 나눈 수
    var lcm = (n * m) / gcd;
    
    return answer = [gcd, lcm];
}