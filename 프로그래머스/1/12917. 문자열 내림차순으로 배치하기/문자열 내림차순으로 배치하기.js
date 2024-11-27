function solution(s) {
    var answer = '';
    
    // 문자열 => 배열 => 오름차순 정렬 => 내림차순 정렬 => 문자열
    return answer = s.split('').sort().reverse().join('');
}