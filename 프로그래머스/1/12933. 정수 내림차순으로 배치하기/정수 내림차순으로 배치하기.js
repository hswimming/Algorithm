function solution(n) {
    // 문자열 배열로 변환 후 내림차순 정렬
    var num = String(n).split('').sort((a, b) => b - a);
    var answer = 0;
    
    // 연결된 새로운 문자열 변환 후 형 변환
    return answer = Number(num.join(''));
}