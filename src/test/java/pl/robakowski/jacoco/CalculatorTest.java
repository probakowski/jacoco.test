package pl.robakowski.jacoco;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void shouldAdd() throws Exception {
        Assert.assertEquals(5, new Calculator().add(3, 2));
    }

}