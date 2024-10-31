function solution(my_string) {
    // 문자 제외 정규 표현식
    var pattern = my_string.replace(/[A-Z]/ig, '');
    var answer = 0;
    
    for (let i = 0; i < pattern.length; i++) {
        // 문자 => 숫자 변환, 더하면서 추가
        answer += Number(pattern[i]);
    }
    
    return answer;
}