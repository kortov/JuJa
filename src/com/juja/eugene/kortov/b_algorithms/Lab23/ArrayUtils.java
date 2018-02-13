package com.juja.eugene.kortov.b_algorithms.Lab23;

import java.util.Arrays;

//Реализуйте метод rotateClockwise класса ArrayUtils, который
//
//        1. Проверяет, что метод получил "кубическую" матрицу (допустимые размеры 1x1x1, 2x2x2, 3x3x3, ...)
//          иначе возвращает null; (возможные ошибки: аргумент равен null, "длина" / "ширина" / "высота" не равны,
//          есть строки разной длины, есть строки с null вместо одномерных/двумерных массивов ...)
//        2. "Проворачивает куб" относительно главной диагонали проходящей от элемента [0][0][0]
//          до элемента [L-1][L-1][L-1] (L - длина "грани куба") массив по часовой стрелке на 120 градусов
//          (по часовой стрелке - если смотреть вдоль оси от элемента [L-1][L-1][L-1] в сторону элемента [0][0][0]),


//        [[[1]]] -> [[[1]]]
//        [  [[1, 2], [3, 4]], [[5, 6], [7, 8]] ] -> [ [[1, 5], [2, 6]], [[3, 7], [4, 8]] ]
//        [ [[10, 11, 12], [20, 21, 22], [30, 31, 32]], [[40, 41, 42], [50, 51, 52], [60, 61, 62]], [[70, 71, 72], [80, 81, 82], [90, 91, 92]] ] ->
//        [ [[10, 40, 70], [11, 41, 71], [12, 42, 72]], [[20, 50, 80], [21, 51, 81], [22, 52, 82]], [[30, 60, 90], [31, 61, 91], [32, 62, 92]] ] ...

public class ArrayUtils {
    public static void main(String[] args) {
//        System.out.println(rotateClockwise(new int[1][0][]));
//        System.out.println(Arrays.deepToString(rotateClockwise(new int[1][1][0])));
//        rotateClockwise(new int[][][]{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}});
        printCube(new int[][][]{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}});
    }

    public static int[][][] rotateClockwise(int[][][] arg) {
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
        if (arg[0].length == 0) {
            return null;
        }
        if (arg[0][0] == null) {
            return null;
        }
        int[][][] result = new int[arg.length][arg[0].length][arg[0][0].length];


//        1 2
//        3 4 5 6
//            7 8
//        k++   j++     i++
//        j++   i++     k++
//
//        1 5
//        2 6 3 7
//            4 8

        for (int i1 = 0, k2 = 0; i1 < arg.length; i1++, k2++) {
                if (arg[i1].length != arg.length) {
                    return null;
                }
                if (arg[i1] == null) {
                    return null;
                }
            for (int j1 = 0, i2 = 0; j1 < arg[i1].length; j1++, i2++) {
                if (arg[i1][j1].length != arg[i1].length) {
                    return null;
                }
                if (arg[i1][j1] == null) {
                    return null;
                }
                for (int k1 = 0, j2 = 0; k1 < arg[i1][j1].length; k1++, j2++) {
                    result[i2][j2][k2] = arg[i1][j1][k1];
                }
            }
        }





        return result;
    }

    private static void printCube(int[][][] arg) {
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                for (int k = 0; k < arg[i][j].length; k++) {
                    System.out.print(arg[i][j][k] + " ");
                }
                System.out.println();
                if (i > 0) {
                    System.out.print("\t");

                }
            }
            System.out.print("\t");
        }
    }
}
