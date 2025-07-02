package Miscellaneous;

public class Harmonious_Array {
    	public static void main(String[] args) {
        // int arr[]={1,2,2,2,3,4,2,2,1}; //2
        //  int arr[]={1,2,2,1,2}; //1
        int arr[]={1,1,1,1,1}; //1
        int pick=0;
        int count=0;
        int prevCount=0;
        int ans=0;
    
        for(int i=0;i<arr.length;i++){
            pick = arr[i];
             prevCount=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==pick){
                    prevCount++;
                    j++;
                }
            }  
            if(prevCount>count){
                count=prevCount;
                ans=arr[i];
            }
            else if (prevCount == count && pick < ans) {
                ans = pick;
            }
        }
        System.out.println(ans);
	}
    
}
