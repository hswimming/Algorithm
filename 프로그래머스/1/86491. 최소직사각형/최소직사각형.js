function solution(sizes) {
    // 명함을 회전시켜 겹쳤을 경우
    // 가로, 세로 중 큰 값 => 가로 / 작은 값 => 세로
    // ex) 가로 30, 세로 70 => 회전시키면 가로 70, 세로 30
    
    var answer = 0;
    var width = 0;
    var height = 0;
    
    for (let i = 0; i < sizes.length; i++) {
        var max = Math.max(sizes[i][0], sizes[i][1]); // 가로
        var min = Math.min(sizes[i][0], sizes[i][1]); // 세로
        
        width = Math.max(width, max); // 큰 값 중 가장 큰 값
        height = Math.max(height, min); // 작은 값 중 가장 큰 값
    }
    
    return answer = width * height;
}