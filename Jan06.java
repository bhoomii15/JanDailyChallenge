package com.bhoomi;
import java.util.Arrays;

//https://leetcode.com/problems/maximum-ice-cream-bars/description/
public class Jan06 {
    public static void main(String[] args) {

        int[] costs = {1,3,2,4,1};
        int coins = 7;

        System.out.println(maxIceCream(costs, coins));

    }

    static int maxIceCream(int[] costs, int coins) {
        //more optimised approach
        Arrays.sort(costs);

        for (int i = 0; i < costs.length; ++i)
            if (coins >= costs[i])
                coins -= costs[i];
            else
                return i;

        return costs.length;

    }
}


//        Arrays.sort(costs);
//        int count = 0;
//        int ans = 0;
//        for(int cost : costs){
//            if(coins >= cost){
//                coins -= cost;
//                count++ ;
//                ans = count;
//            }
//            if(coins == 0) break;
//        }
//        return ans;