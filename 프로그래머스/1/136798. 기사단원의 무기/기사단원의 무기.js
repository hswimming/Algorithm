function solution(number, limit, power) {
    var answer = 0;
    
    for (let i = 1; i <= number; i++) {
        var count = 0;
        
        // 시간 초과를 방지하기 위해 전체 순회 X
        for (let j = 1; j <= Math.sqrt(i); j++) {
            if (i % j === 0) {
                // i가 16인 경우 ? j가 1일 때 16 / 1 = 16 (false), 약수(1, 16) => 2개
                // j가 2일 때 16 / 2 = 8 (false), 약수(2, 8) => 2개
                // j가 4일 때 16 / 4 = 4 (true), 약수(4, 4) => 중복 방지를 위해 + 1
                if (i / j === j) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        // 약수의 개수가 limit를 넘으면 power로 변경
        answer += (limit < count) ? power : count;
    }
    
    return answer;
}