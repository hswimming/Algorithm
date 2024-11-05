function solution(dots) {
    // 각 변의 길이 = 가장 왼쪽, 가장 오른쪽 / 가장 위, 가장 아래 있는 점의 차이
    // 즉, 직사각형의 가로 / 세로 범위 = 각 범위 최대값 - 최소값
    // 넓이 = 가로 * 세로
    
    var answer = 0;
    var xMin = dots[0][0];
    var yMin = dots[0][1];
    var xMax = dots[0][0];
    var yMax = dots[0][1];
    
    // Math.min, Math.max 사용하는 경우
    for (let i = 1; i < dots.length; i++) {
        xMin = Math.min(xMin, dots[i][0]); // x 최소값
        yMin = Math.min(yMin, dots[i][1]); // y 최소값
        xMax = Math.max(xMax, dots[i][0]); // x 최대값
        yMax = Math.max(yMax, dots[i][1]); // y 최대값
    }
    
    // Math.min, Math.max 사용하지 않을 경우
    // else if 사용하면 dots 배열의 모든 좌표를 비교하지 못함
    /*
    for (let i = 1; i < dots.length; i++) {
        if (dots[i][0] < xMin) {
            xMin = dots[i][0]; // x 최소값
        }
        
        if (dots[i][1] < yMin) {
            yMin = dots[i][1]; // y 최소값
        }
        
        if (dots[i][0] > xMax) {
            xMax = dots[i][0]; // x 최대값
        }
        
        if (dots[i][1] > yMax) {
            yMax = dots[i][1]; // y 최대값
        }
    }
    */
    
    // Math.abs(n) => 음수 처리, 음수에서 양수로만 변환 가능
    // -1을 곱해서 음수를 양수로 처리하는 방법도 있지만 양수일 경우 음수로 바뀌어버림
    return answer = Math.abs((xMax - xMin) * (yMax - yMin));
}