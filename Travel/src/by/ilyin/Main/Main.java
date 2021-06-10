package by.ilyin.Main;

import by.ilyin.Algorithms.Algorithms;

public class Main {
    public static void main(String[] args) {
        Integer[][] matrix = {
                {Integer.MAX_VALUE, 11, 5, 7, 2, 9},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 12, 5, 9, 2},
                {3, 12, Integer.MAX_VALUE, Integer.MAX_VALUE, 7, 10},
                {7, 5, 3, Integer.MAX_VALUE, 7, 3},
                {2, 9, 7, 4, Integer.MAX_VALUE, 10},
                {9, 2, 10, 3, 10, Integer.MAX_VALUE}};


        matrix = Algorithms.floydAlgorithm(matrix);

        System.out.println("Little's algorithm");
        Algorithms.littleAlgorithm(matrix);
    }
}
