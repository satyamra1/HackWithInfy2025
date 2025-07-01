package GreedyApproch;

import java.util.Arrays;

public class Problem2_AssignCookies {
     public static void main(String[] args){
        int g[]={1,2,2};
        int s[] ={1,2,2};
        int ans = findContentChildren(g,s);
        System.out.println(ans);
    }

public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (g[j] <= s[i]) j++;  
            i++; 
        }

        return j;
    }
}