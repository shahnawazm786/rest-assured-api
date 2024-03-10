package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ReArrangeDigit {
    public static void main(String[] args) {
        int result=633245;
        Integer[] number=new Integer[6];
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
        Arrays.sort(number,Collections.reverseOrder());
        System.out.println();
        int x=100000;
        for(int i=0;i<=5;i++){
            System.out.print(number[i]);
        result=result + number[i]*x;
        x=x/10;
        }
        System.out.println();
        System.out.println(result);
    }
}
