function solution(array) {
    var answer = [];
    var max = Math.max(...array);
    var idx = array.indexOf(Math.max(...array));
    
    return answer = [max, idx];
}