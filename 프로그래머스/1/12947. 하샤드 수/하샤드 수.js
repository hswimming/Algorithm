function solution(x) {
    // 문자열로 변환 후 구분자로 자른 배열 반환
    var arr = String(x).split('');
    var num = 0;
    var answer = true;
    
    for (let i = 0; i < arr.length; i++) {
        num += Number(arr[i]); // 문자 => 숫자
    }
    
    // 매개변수 x가 자릿수의 합으로 나누어 떨어지면 하샤드 수
    return answer = (x % num === 0) ? true : false;
}