function solution(arr) {
    // 배열의 최소값을 제외한 모든 요소를 새로운 배열로 반환
    var min = arr.filter(e => e != Math.min(...arr));
    var answer = [];
    
    return answer = (arr.length != 1) ? min : [-1];
}