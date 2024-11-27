function solution(arr1, arr2) {
    var answer = [[]];
    
    // map() => 각 행을 변환한 결과를 누적하여 새로운 배열로 변환
    // row1 => arr1의 각 행, col1 => 현재 행의 인덱스(열)
    // row2 => 현재 행의 요소, col2 => 현재 행의 인덱스(열)
    // arr2[col1][col2] => 동일한 위치에 있는 arr2의 요소
    return answer = arr1.map((row1, col1) => 
        row1.map((row2, col2) => row2 + arr2[col1][col2]));
}