class Solution {
    static boolean equalPartition(int arr[]) {

        int n = arr.length;
        int sum =0;
        
        for(int num : arr){
            sum += num;
        }
        
        if(sum % 2 != 0) return false;
        
        int target = sum /2;
        
        boolean[] dp = new boolean[target + 1];
        
        dp[0] = true;
        
    for(int num : arr){
        for(int j= target; j>=num; j--){
            if(dp[j-num]){
                dp[j] = true;
            }
        }
    }
    
    return dp[target];
        
    }
}
