function solution(my_string) {
    // 영문자 제외 정규 표현식, 치환된 공백 제거
    var pattern = my_string.replace(/[A-Z]/ig, '').split('');
    var answer = [];
    
    // 문자열 배열 => 숫자열 배열 변환, 정렬
    return answer = pattern.map(Number).sort();
}