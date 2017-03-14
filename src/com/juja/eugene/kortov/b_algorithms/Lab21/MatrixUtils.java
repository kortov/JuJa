//Реализовать метод, умножающий две 2-мерные матрицы (не обязательно квадратные). Произведение двух двумерных матриц матриц A и B размером NxM и MxK- это матрица С размером NxK, где каждый элемент C[i][j] высчитывается по формуле: C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ... + A[i][N-1]*B[N-1][j] Пример:
//
//        |1 2|   |3 4 5 6|   |21 4  7  10|
//        |7 8| * |9 0 1 2| = |93 28 43 58|
//        |3 4|               |45 12 19 26|
//        так как 1*3 + 2*9 = 21, 1*4 + 2*0 = 4, 1*5 + 2*1 = 7, 1*6 + 2*2 = 10 7*3 + 8*9 = 93, 7*4 + 8*0 = 28, 7*5 + 8*1 = 43, 7*6 + 8*2 = 58 3*3 + 4*9 = 45, 3*4 + 4*0 = 12, 3*5 + 4*1 = 19, 3*6 + 4*2 = 26
//        1. Если один из аргументов равен null - throw new IllegalArgumentException().
//        2. Если один из аргументов НЕ прямоугольная/квадратная матрица - throw new IllegalArgumentException().
//        3. Если одна из матриц содержит null в качестве строки - throw new IllegalArgumentException().
//        4. Если ширина первой матрицы не равна высоте второй матрицы - throw new IllegalArgumentException().
//        Подсказка: вам необходим тройной вложенный цикл.
package com.juja.eugene.kortov.b_algorithms.Lab21;

public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {
        /*BODY*/

        int[][] result = new int[fst.length][];

        if (fst == null || snd == null) {
            throw new IllegalArgumentException();
            //1
        }

        for (int fstY = 0; fstY < fst.length; fstY++) {
            for (int fstX = 0; fstX < fst[fstY].length; fstX++) {
                int res = 0;

                argChecks(fst, snd, fstY);


                for (int sndX = 0; sndX < snd[fstX].length; sndX++) {
                    argCheck2(snd, fstX);
                    if (sndX == 0) {
                        result[fstY] = new int[snd[fstX].length];
                    }

                    result[fstY][sndX] += fst[fstY][fstX] * snd[sndX][fstX];
                }

            }
        }
        return result;


    }

    private static void argCheck2(int[][] snd, int fstX) {
        if (snd[fstX] == null) {
            throw new IllegalArgumentException();
            //3
        }
        if (fstX != 0 && snd[fstX].length != snd[fstX - 1].length) {
            throw new IllegalArgumentException();
            //2
        }
    }

    private static void argChecks(int[][] fst, int[][] snd, int fstY) {
        if (fst[fstY] == null) {
            throw new IllegalArgumentException();
            //3
        }
        if (fst[fstY].length != snd.length) {
            throw new IllegalArgumentException();
            //4
        }
        if (fstY != 0 && fst[fstY].length != fst[fstY - 1].length) {
            throw new IllegalArgumentException();
            //2
        }
    }
} 
