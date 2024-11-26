function solution(s) {
    var answer = '';
    
    // charAt() => 인덱스 위치에 해당하는 문자를 반환
    return answer = (s.length % 2 === 0) ? s.slice((s.length / 2) - 1, (s.length / 2) + 1) : s.charAt(s.length / 2);
}