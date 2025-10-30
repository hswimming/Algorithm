class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1. 소문자 치환
        new_id = new_id.toLowerCase();
        
        // 2. 허용 문자 외 제거 (소문자, 숫자, -, _, .)
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3. 마침표 2번 이상 연속된 부분 치환
        new_id = new_id.replaceAll("\\.+", ".");
        
        // 4. 처음이나 끝에 있는 마침표 제거
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        
        // 5. 빈 문자열이면 a 대입
        if (new_id.isEmpty()) new_id = "a";
        
        // 6. 길이가 16자 이상이면 15자로 자르고 끝이 .이면 제거
        if (16 <= new_id.length()) {
            new_id = new_id.substring(0, 15).replaceAll("[.]$", "");
        }
        
        // 7. 길이가 2 이하면 마지막 문자를 길이가 3이 될 때까지 반복
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        
        return answer = new_id;
    }
}