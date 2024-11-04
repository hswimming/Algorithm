function solution(babbling) {
    var answer = 0;
    
    for (let i = 0; i < babbling.length; i++) {
        // 가능한 발음과 동일한 문자열을 빈 문자열로 변환
        babbling[i] = babbling[i].replaceAll(/(aya|ye|woo|ma)/ig, "");
        
        // 동일하면 빈 문자열이 되므로 answer 증가
        if (babbling[i] == "") {
            answer++;
        }
    }
    
    return answer;
}