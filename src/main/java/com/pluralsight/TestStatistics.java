package com.pluralsight;

public class TestStatistics {

    public static void main(String[] args) {

        //Creating array of 10 scores
        int[] testScores = {45, 50, 55, 65, 75, 80, 85, 90, 95, 100};

        //Calculating the sum of test scores using a for loop
        int sum = 0;

        for ( int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

            //Now calculating the average
            double average = (double) sum / testScores.length;

            //Using a for loop to find the highest score

            int max = testScores[0];

            for (int i = 0; i < testScores.length; i++) {
                if (testScores[i] > max) {
                    max = testScores[i];
                }
            }

//            Calculating the lowest score using for loop

            int min = testScores[0];
            for (int i = 0; i < testScores.length; i++) {
                if (testScores[i] < min) {
                    min = testScores[i];

                }

        }

        //Now, displaying the results of test scores
        System.out.println("Average: " + average);
        System.out.println("High score: " + max);
        System.out.println("Low score: " + min);





    }

}
