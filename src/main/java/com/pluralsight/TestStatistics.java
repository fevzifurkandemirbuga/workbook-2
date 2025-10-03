package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

//        int[] scores={1,2,3,4,5,6,7,9,8,10};
        int[] scores={23,75,90,42,52,13,86,36,86,32};

        Arrays.sort(scores);

        int lowestScore =scores[0];
        int highestScore= scores[scores.length-1];
        int sum=0;

        for (int i=0;i<scores.length;i++){
            sum+=scores[i];
        }

        float average= (float) sum /scores.length;
        float median=0;

        if(scores.length%2==1){
            median=scores[(scores.length-1)/2];
        }
        else{
            median= (float) (scores[scores.length / 2] + scores[(scores.length / 2) - 1]) /2;
        }

        System.out.println("highestScore = " + highestScore);
        System.out.println("lowestScore = " + lowestScore);
        System.out.println("average = " + average);
        System.out.println("sum = " + sum);
        System.out.println("median = " + median);


    }
}
