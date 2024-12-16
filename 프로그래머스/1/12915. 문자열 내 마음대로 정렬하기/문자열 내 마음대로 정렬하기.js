function solution(strings, n) {
    var answer = [];
    
    // 반환값 음수 => a가 b보다 앞 / 0 => 순서 유지 / 양수 => b가 a보다 앞
    strings.sort((a, b) => {
        if (a.charAt(n) < b.charAt(n)) return -1;
        // n번째 인덱스 값이 동일하면 사전순으로 정렬
        if (a.charAt(n) === b.charAt(n)) return a < b ? -1 : 1;
        if (a.charAt(n) > b.charAt(n)) return 1;
    });
    
    return answer = strings;
}