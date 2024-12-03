function solution(s, n) {
    var answer = '';
    
    for (let i = 0; i < s.length; i++) {
        var ascii = s.charCodeAt(i); // 문자열 => 아스키 코드 변환
        
        if (65 <= ascii && ascii <= 90) { // A~Z 범위
            ascii += n;
            
            if (90 < ascii) { // A~Z 범위 차이 25, 앞 문자 범위까지 빼기
                ascii -= 26;
            }
        } else if (97 <= ascii && ascii <= 122) { // a~z 범위
            ascii += n;
            
            if (122 < ascii) { // a~z 범위 차이 25, 앞 문자 범위까지 빼기
                ascii -= 26;
            }
        }
        answer += String.fromCharCode(ascii); // 아스키 코드 => 문자열 변환
    }
    
    return answer;
}