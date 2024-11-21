function solution(s){
    // 매개변수 문자열 소문자 변환 후 구분자로 자른 배열 반환
    var py = s.toLowerCase().split('');
    var countP = 0;
    var countY = 0;
    var answer = true;
    
    for (let i = 0; i < py.length; i++) {
        if (/[p]/.test(py[i]) === true) {
            countP++; // p 개수 카운트
        } else if (/[y]/.test(py[i]) === true) {
            countY++; // y 개수 카운트
        }
    }

    return answer = (countP === countY) ? true : false;
}