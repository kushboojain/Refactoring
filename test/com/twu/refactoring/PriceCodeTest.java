package com.twu.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by khusbooj on 09/01/15.
 */
public class PriceCodeTest {
    @Test
    public void shouldCheckAmountOfRegularGreaterThan2() {
        assertEquals(new Regular().amount(5), 6.5,0.1);
    }
    @Test
    public void shouldCheckAmountOfNewRelease() {
        assertEquals(new NewRelease().amount(5), 15,0.1);
    }
    @Test
    public void shouldCheckAmountOfChindrensGreaterThan3() {
        assertEquals(new Childrens().amount(5), 4.5,0.1);
    }


    @Test
    public void shouldCheckAmountOfRegularLessThan2() {
        assertEquals(new Regular().amount(1), 2,0.1);
    }

    @Test
    public void shouldCheckAmountOfChindrensLessThan3() {
        assertEquals(new Childrens().amount(1), 1.5,0.1);
    }


    @Test
    public void shouldCheckPointsOfRegular() {
        assertEquals(new Regular().frequentPointers(5), 1,0.1);
    }

    @Test
    public void shouldCheckPointsOfChindrens() {
        assertEquals(new Childrens().frequentPointers(5), 1,0.1);
    }

    @Test
    public void shouldCheckPointsOfNewReleaseGreaterThan1() {
        assertEquals(new NewRelease().frequentPointers(5), 2,0.1);
    }
    @Test
    public void shouldCheckPointsOfNewReleaseNotGreaterThan1() {
        assertEquals(new NewRelease().frequentPointers(1), 1,0.1);
    }


}
