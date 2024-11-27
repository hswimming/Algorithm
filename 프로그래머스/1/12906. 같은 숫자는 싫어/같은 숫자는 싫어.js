function solution(arr) {
    var answer = [];
    
    // 마지막 요소는 undefined랑 비교하므로 포함
    return answer = arr.filter((e, i) => e != arr[i + 1]);
}