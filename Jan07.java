package com.bhoomi;


//https://leetcode.com/problems/gas-station/
public class Jan07 {
    public static void main(String[] args) {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {

        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        int temp = 0;
        int sgas = 0;
        int scost = 0;

        for(int i=0; i<cost.length; i++){
            temp += gas[i] - cost[i];
            if(temp < minValue){
                minIndex = i;
                minValue = temp;
            }

            sgas += gas[i];
            scost += cost[i];
        }

        if(sgas < scost) return -1;

        if(minIndex == cost.length - 1){
            return 0;
        }
        else{
            return minIndex + 1;
        }

    }

}
