function solution(s) {
    var answer = [];
    var str = [];
    
    [...s].map((cur, idx) => { // 전개 연산자로 배열처럼 사용
        if (!str.includes(cur)) {
            answer.push(-1);
        } else {
            // 원본 배열을 현재 문자까지 자르고 뒤에서부터 현재 문자의 인덱스 가져오기
            // 복사한 배열에서 현재와 동일한 문자의 인덱스 뒤에서부터 가져오기 (중복이 있으므로)
            answer.push(s.slice(0, idx + 1).lastIndexOf(cur) - str.lastIndexOf(cur));
        }
        str.push(cur); // 인덱스 계산을 위해 추가
    });
    
    return answer;
}