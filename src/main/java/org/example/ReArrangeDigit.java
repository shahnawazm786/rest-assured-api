package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ReArrangeDigit {
    public static void main(String[] args) {
        int result=633245;
        int[] number=new int[6];
        int k=0;
        int temp;
        while(result>0){
            temp=result%10;
            number[k]=temp;
            k++;
            result=result/10;
        }
      //  System.out.println(number);
        for(int i=0;i<6;i++){
            System.out.println(number[i]);
        }
        Arrays.sort(number);

        for(int i=0;i<6;i++){
            System.out.println(number[i]);
        }

    }
}