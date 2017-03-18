package com.juja.eugene.kortov.b_algorithms.Lab22;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateClockwiseTest {

    @Test
    public void nullTest() {
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(new int[][] {{0, 0}, {0}}));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(null));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(new int[0][]));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(ArrayUtils.rotateClockwise(new int[][] {null})));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(new int[][] {{0, 0}, {0}}));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(new int[][] {{0, 0}, null}));

    }
    @Test
    public void test1() {
        int[][] oldArray = {{1}};
        int[][] newExpectedArray = {{1}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

    }
    @Test
    public void test2() {
        int[][] oldArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] newExpectedArray = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

    }
    @Test
    public void test3() {
        int[][] oldArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] newExpectedArray = new int[][]{{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

    }
}
