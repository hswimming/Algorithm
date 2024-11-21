function solution(n) {
    var arr = String(n);
    var answer = [];
    
    for (let i = (arr.length - 1); 0 <= i; i--) {
        answer.push(Number(arr[i]));
    }
    
    return answer;
}