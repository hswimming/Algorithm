function solution(s) {
    var answer = true;
    
    // 길이가 4 or 6, 시작(^)부터 끝($)까지 문자열이 0 ~ 9 사이의 숫자로만 구성
    return answer = /^[0-9]{4}$|^[0-9]{6}$/.test(s);
}