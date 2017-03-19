package com.juja.eugene.kortov.b_algorithms.Lab23;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateClockwiseTest {

    @Test
    public void nullTest() {
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(null));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(new int[0][][]));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(ArrayUtils.rotateClockwise(new int[][][]{null})));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(new int[1][1][0]));
        Assert.assertArrayEquals(null, ArrayUtils.rotateClockwise(new int[1][0][]));

    }

    @Test
    public void test1() {
        int[][][] oldArray = {{{1}}};
        int[][][] newExpectedArray = {{{1}}};
        int[][][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

    }

    @Test
    public void test2() {
        int[][][] oldArray = new int[][][]{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int[][][] newExpectedArray = new int[][][]{{{1, 5}, {2, 6}}, {{3, 7}, {4, 8}}};
        int[][][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

    }

    @Test
    public void test3() {
        int[][][] oldArray = new int[][][]{ {{10, 11, 12}, {20, 21, 22}, {30, 31, 32}}, {{40, 41, 42}, {50, 51, 52}, {60, 61, 62}}, {{70, 71, 72}, {80, 81, 82}, {90, 91, 92}} };
        int[][][] newExpectedArray = new int[][][]{ {{10, 40, 70}, {11, 41, 71}, {12, 42, 72}}, {{20, 50, 80}, {21, 51, 81}, {22, 52, 82}}, {{30, 60, 90}, {31, 61, 91}, {32, 62, 92}} };
        int[][][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

    }
}
