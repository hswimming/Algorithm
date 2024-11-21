function solution(n) {
    // 자연수 N을 문자열로 변경 후 구분자로 자른 배열 반환
    var num = (n).toString().split('');
    var answer = 0;
    
    for (let i = 0; i < num.length; i++) {
        answer += parseInt(num[i]); // 문자 => 숫자
    }

    return answer;
}