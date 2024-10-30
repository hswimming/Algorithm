function solution(my_string) {
    var answer = '';
    
    // 정규 표현식으로 확인
    // i => 대소문자 구분 X / g => 문자열 전부 확인
    return answer = my_string.replace(/[aeiou]/ig, '');
}