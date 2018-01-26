package ru.test.Sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {
    @Test
    public void testDistance() {
        Point s1 = new Point(2, 4);
        Point s2 = new Point(1, 4);
        Assert.assertEquals( ru.test.Sandbox.Point.distance(s1,s2), 1.0);
    }
}
