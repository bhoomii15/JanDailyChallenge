package com.bhoomi;
import java.util.Scanner;

//https://leetcode.com/problems/find-the-town-judge/description/
public class Jan23 {

    public static void main(String[] args) {

    }

    static int findJudge(int n, int[][] trust) {

        int[] count = new int[n+1];

        for(int[] t : trust){
            count[t[0]]--;
            count[t[1]]++;
        }

        for(int i = 1; i<=n; i++){
            if(count[i] == n-1){
                return i;
            }
        }

        return -1;
    }
}
