package GreedyApproch;

import java.util.Arrays;

public class Problem1_BuyTwoChocolates {

    public static void main(String[] args){
        int prices[]={1,2,2};
        int money =3;
        int ans = buyChoco(prices,money);
        System.out.println(ans);
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int paisa =money;
        for(int i=0;i<2;i++){
            paisa-=prices[i];
        }
        System.out.print(paisa);
        if(paisa<0){
            return money;
        }
        return paisa;
        
    }

    
}
