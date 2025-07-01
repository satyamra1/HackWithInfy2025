package GreedyApproch;

import java.util.Arrays;

public class Problem5_Maximum_Length_of_Pair_Chain {
     public static void main(String[] args){
        int pairs[][] = {{1,2},{2,3},{3,4}};
      
        int ans = findLongestChain(pairs);
        System.out.println(ans);
     }
    

 public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs , (a,b)-> a[1]-b[1]);
        int x = pairs[0][1];
        int count = 1;

        for(int i= 1 ;i<pairs.length;i++){
            if(pairs[i][0] > x){
                count++;
                x=pairs[i][1];
            }
        }
        return count;
    }

}