function solution(numlist, n) {
    var answer = [];
    
    return answer = numlist.sort((a, b) => {
        // n과 거리 차이 절대값
        var numA = Math.abs(a - n);
        var numB = Math.abs(b - n);
        
        // 절대값 차이가 같다면 거리가 같음, 내림차순 정렬
        if (numA === numB) return b - a;
        
        // 절대값 차이(거리) 오름차순 정렬
        return numA - numB;
    });
}