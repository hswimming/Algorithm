function solution(s) {
    var answer = 0;
    var str = s.split(' '); // 공백으로 구분된 문자열 자르기
    
    for (let i = 0; i < str.length; i++) {
        // 문자열 배열이 반환되므로 숫자로 변환해서 연산
        if (str[i] != 'Z') {
            answer += Number(str[i]);
        } else {
            // 'Z' 나오면 전에 더했던 숫자 빼기
            answer -= Number(str[i - 1]);
        }
    }
    
    return answer;
}