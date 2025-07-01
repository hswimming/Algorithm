class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // bill의 작은 값이 wallet의 작은 값 보다 크거나
        // bill의 큰 값이 wallet의 큰 값 보다 큰 동안만 반복해야 함
        while (size(wallet, bill)) {
            if (bill[1] < bill[0]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
        }
        
        return answer;
    }
    
    // wile문 안의 if문으로 작성해도 되지만 가독성 떨어짐
    public static boolean size(int[] wallet, int[] bill) {
        int minBill = Math.min(bill[0], bill[1]);
        int minWallet = Math.min(wallet[0], wallet[1]);
        int maxBill = Math.max(bill[0], bill[1]);
        int maxWallet = Math.max(wallet[0], wallet[1]);
        
        return (minWallet < minBill) || (maxWallet < maxBill);
    }
}