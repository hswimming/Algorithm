function solution(n) {
    // 10진법 => 3진법 변환 => 문자열 배열 뒤집기 => 문자열로 합치기
    var answer = String(n.toString(3)).split('').reverse().join('');
    
    return answer = parseInt(answer, 3); // 뒤집은 3진법 => 10진법 변환
}