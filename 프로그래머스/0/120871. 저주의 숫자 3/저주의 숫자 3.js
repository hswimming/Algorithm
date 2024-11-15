function solution(n) {
    var num = 1; // 3x 마을에서 쓰는 숫자
    var answer = 0;
    
    // 10진법이 순차적으로 증가할 때 3x 마을에서 쓰는 숫자 찾기
    for (let i = 1; i <= 100; i++) {
        // 3으로 나누어떨어지면 3의 배수
        // 정규 표현식의 패턴은 텍스트 기반 => 데이터를 문자열로 변환해야 매칭 적용
        while (num % 3 === 0 || /[3]/.test(num.toString()) === true) {
            num++; // 조건을 만족하지 않을 때까지 num 확인
        }
        
        if (i === n) {
            answer = num;
            break;
        } else {
            num++; // i가 매개변수와 다를 경우 계속 확인
        }
    }
    
    return answer;
}