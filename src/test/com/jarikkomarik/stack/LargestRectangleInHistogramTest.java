package com.jarikkomarik.stack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();

    @Test
    public void doTest1() {
        Assertions.assertThat(largestRectangleInHistogram.largestRectangleArea(new int[]{2,1,5,6,2,3})).isEqualTo(10);
    }
    @Test
    public void doTest2() {
        Assertions.assertThat(largestRectangleInHistogram.largestRectangleArea(new int[]{2,4})).isEqualTo(4);
    }
    @Test
    public void doTest3() {
        Assertions.assertThat(largestRectangleInHistogram.largestRectangleArea(new int[]{0,9})).isEqualTo(9);
    }
    @Test
    public void doTest4() {
        Assertions.assertThat(largestRectangleInHistogram.largestRectangleArea(new int[]{9,0})).isEqualTo(9);
    }
    @Test
    public void doTest5() {
        Assertions.assertThat(largestRectangleInHistogram.largestRectangleArea(new int[]{4,2,0,3,2,4,3,4})).isEqualTo(10);
    }
    @Test
    public void doTest6() {
        Assertions.assertThat(largestRectangleInHistogram.largestRectangleArea(new int[]{5,5,1,7,1,1,5,2,7,6})).isEqualTo(12);
    }
}
