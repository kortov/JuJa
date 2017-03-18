package com.juja.eugene.kortov.b_algorithms.Lab22;

//Реализуйте метод rotateClockwise(int[][]) класса ArrayUtils, который
// 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
// (возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины,
// есть строки с null вместо одномерных массивов)
// 2) "проворачивает" массив по часовой стрелке на 90 градусов, т.е [1] -> [1]
// [[1, 2], [3, 4]] -> [[3, 1], [4, 2]]
// [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
//        System.out.println(rotateClockwise(new int[][] {null}));
//        System.out.println(Arrays.deepToString(rotateClockwise(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
//        System.out.println(Arrays.deepToString(rotateClockwise(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}})));
    }

    public static int[][] rotateClockwise(int[][] arg) {
        /*BODY*/
        if (arg == null) {
            return null;
        }
        if (arg.length == 0) {
            return null;
        }
        if (arg[0] == null) {
            return null;
        }
        if (arg.length != arg[0].length) {
            return null;
        }
        int[][] result = new int[arg.length][arg[0].length];



        // 123  741
        // 456  852
        // 789  963

        //  1  2   3  4   13 9  5  1
        //  5  6   7  8   14 10 6  2
        //  9  10 11 12   15 11 7  3
        //  13 14 15 16   16 12 8  4

        for (int i = 0, l = result[i].length - 1; i < arg.length && l >= 0; i++, l--) {
            if (arg[i] == null) {
                return null;
            }
            if (i != 0 && arg[i].length != arg[i - 1].length) {
                return null;
            }
            for (int j = 0, k = 0; j < arg[i].length && k < result.length; j++, k++) {
                result[k][l] = arg[i][j];

            }
        }



        return result;
    }
}


