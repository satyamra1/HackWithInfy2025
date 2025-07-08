package Dp;
import java.util.*;
public class House_Robber {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.print(Robber(nums,0,dp));

    }

    public static int Robber(int[] nums, int i, int[] dp) {

        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];

        }

        int rob =nums[i]+ Robber(nums, i+2, dp);
        int not_rob=Robber(nums, i+1, dp);
        
        return dp[i]= Math.max(rob,not_rob);
    }
    
}
