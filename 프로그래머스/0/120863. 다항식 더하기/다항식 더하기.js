function solution(polynomial) {
    // 항과 연산기호 사이에는 항상 공백이 존재하므로 공백을 기준으로 분리
    var str = polynomial.split(' ');
    var pattern = /\d+/; // 숫자를 찾는 정규 표현식
    var linear = 0; // 일차항 더한 값
    var quadratic = 0; // 상수항 더한 값
    var answer = '';
    
    for (let i = 0; i < str.length; i++) {
        // 자른 문자열 배열 요소에 x가 포함된 문자열 찾기
        if (str[i].includes('x')) {
            // x 앞의 숫자 연산을 위해 치환
            var s = str[i].replace('x', '');
            // x 앞에 숫자가 없으면 1로 간주, 있으면 형 변환 후 연산
            linear += s.length === 0 ? 1 : parseInt(s);
        } else if (pattern.test(str[i])) {
            // 숫자로만 구성된 문자열이면 조건 만족
            // str[i].match(pattern) 차이점?
            // test() => 존재 여부 확인, match() => 일치하는 문자열을 추출하여 배열 형태로 반환
            quadratic += parseInt(str[i]);
        }
    }
    
    // 일차항 더한 값이 1이면 숫자 없이 x 반환
    if (linear != 0) {
        answer += (linear == 1 ? 'x' : linear + 'x');
    }
    
    // 상수항이 존재하면 일차항 + 상수항 합친 문자열 반환
    // 문자열과 숫자가 함께 있으면 자동으로 숫자가 문자열로 변환
    if (quadratic != 0) {
        answer += (linear != 0 ? " + " : "") + quadratic;
    }
    
    return answer;
}