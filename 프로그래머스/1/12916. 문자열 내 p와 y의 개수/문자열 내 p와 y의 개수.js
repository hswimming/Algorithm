function solution(s){
    // 매개변수 문자열 소문자 변환 후 구분자로 자른 배열 반환
    var py = s.toLowerCase().split('');
    var countP = 0;
    var countY = 0;
    var answer = true;
    
    // 정규 표현식을 만족하는 p, y 개수 카운트
    for (let i = 0; i < py.length; i++) {
        if (/[p]/.test(py[i]) === true) {
            countP++;
        } else if (/[y]/.test(py[i]) === true) {
            countY++;
        }
    }

    return answer = (countP === countY) ? true : false;
}