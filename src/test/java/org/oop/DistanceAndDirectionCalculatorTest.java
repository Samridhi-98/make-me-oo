package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator();

        Assertions.assertEquals(0, distanceAndDirectionCalculator.distance(origin, origin));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator();

        Assertions.assertEquals(1, distanceAndDirectionCalculator.distance(origin, point1));
        Assertions.assertEquals(1, distanceAndDirectionCalculator.distance(origin, point2));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator();

        Assertions.assertEquals(2, distanceAndDirectionCalculator.distance(point1, point2));
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator();

        Assertions.assertEquals(0, distanceAndDirectionCalculator.direction(origin, point1));
        Assertions.assertEquals(0, distanceAndDirectionCalculator.direction(origin, point2));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator();

        Assertions.assertEquals(Math.PI, distanceAndDirectionCalculator.direction(origin, point1));
        Assertions.assertEquals(Math.PI, distanceAndDirectionCalculator.direction(origin, point2));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator();

        Assertions.assertEquals(Math.PI / 2, distanceAndDirectionCalculator.direction(origin, point2));
        Assertions.assertEquals(Math.PI / 2, distanceAndDirectionCalculator.direction(origin, point1));
    }
}
