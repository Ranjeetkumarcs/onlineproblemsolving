package com.ps.onlineproblem.leetcode.topInterviewquestions.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Slf4j
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the size of Array");
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        log.info("Enter int array of size {}",sizeOfArray);
        for(int i=0;i<sizeOfArray;i++){
            arr[i]=sc.nextInt();
        }
        log.info("Enter the Target value");
        int targetValue = sc.nextInt();
        /* By brute force method */
        /*for(int i=0;i<sizeOfArray;i++){
            for(int j=i+1;j<sizeOfArray;j++){
                if(arr[i]+arr[j] == targetValue){
                    log.info("Indices are {},{} ",i,j );
                }
            }
        } */
        /* in o(n) method */
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<sizeOfArray;i++){
        int value=targetValue-arr[i];
        if(m.containsKey(value)){
            log.info("indices are {} {}",i,m.get(value));
        }else{
            m.put(arr[i],i);
        }

        }

    }
}
