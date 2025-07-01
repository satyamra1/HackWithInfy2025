package GreedyApproch;

import java.util.Arrays;

public class Problem4_Activity_Selection {
    public static void main(String[] args){
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        int ans = activitySelection(start,finish);
        System.out.println(ans);
     }
    public static int activitySelection(int[] start, int[] finish) {
        int [][] arr = new int[start.length][2];
       
       for(int i=0;i<start.length;i++){
           arr[i][0]=start[i];
           arr[i][1]=finish[i];
       }
       
       Arrays.sort(arr,(a,b) -> a[1]-b[1]);
       
    //   for(int i=0;i<start.length;i++){
    //       System.out.println(arr[i][0]+ " "+arr[i][1]);
    //   }
       
       int ans=1;
       int last=arr[0][1];
       
       for(int i =1;i<start.length;i++){
           int startT = arr[i][0];
           if( startT> last){
               last = arr[i][1];
               ans++;
           }
           
           
       }
       return ans;

        
    }
    
}
