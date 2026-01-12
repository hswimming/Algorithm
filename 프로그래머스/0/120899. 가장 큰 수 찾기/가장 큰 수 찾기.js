function solution(array) {
    var answer = [];
    var max = Math.max(...array);
    var idx = array.indexOf(max);
    
    return answer = [max, idx];
}