function solution(my_string) {
    var answer = 0;
    var pattern = /\d+/g; // 하나 이상의 연결된 숫자
    // 정규 표현식을 만족하는 숫자 문자열 배열
    var str = my_string.match(pattern);
    
    if (my_string.match(pattern)) {
        for (let i = 0; i < str.length; i++) {
            answer += parseInt(str[i]);
        }
    } else {
        // 문자열에 자연수가 없는 경우 0 리턴
        answer = 0;
    }
    
    return answer;
}