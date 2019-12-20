import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Program to test TriangleClassification
 * 
 * @author Jessica Young Schmidt
 * @author YOUR NAME
 */
public class TriangleClassificationTest {

    /**
     * Testing side A value of 0 - Invalid
     */
    @Test
    public void testIsValidTriangleSideLengthAZero() {
        assertFalse("Invalid Side A of Zero",
                        TriangleClassification.isValidTriangleSideLength(0, 2, 2));
    }

    // TODO Add 5 more test cases here for isValidTriangleSideLength method

    /**
     * Testing valid triangle with Equilateral
     */
    @Test
    public void testGetTriangleTypeSideLengthEquilateral() {
        assertEquals("Equilateral Triangle", "Equilateral",
                        TriangleClassification.getTriangleTypeSideLength(2, 2, 2));
    }

    // TODO Add 5 more test cases here for getTriangleTypeSideLength method

    /**
     * Testing Invalid Triangle Side Length
     */
    @Test
    public void testGetTriangleTypeSideLengthInvalid() {
        // Invalid test cases are provided for you. You do NOT
        // need to add additional invalid tests. Just make sure these
        // pass!
        try {
            TriangleClassification.getTriangleTypeSideLength(0, 3, 4);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Not a valid triangle based on side length", e.getMessage());
        }

        try {
            TriangleClassification.getTriangleTypeSideLength(10, 4, 3);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Not a valid triangle based on side length", e.getMessage());
        }
    }

    /**
     * Testing angle A value of 0 - Invalid
     */
    @Test
    public void testIsValidTriangleAngleAZero() {
        assertFalse("Invalid Angle A of Zero",
                        TriangleClassification.isValidTriangleAngle(0, 90, 90));
    }

    // TODO Add 5 more test cases here for isValidTriangleAngle method

    /**
     * Testing Right Angle
     */
    @Test
    public void testGetTriangleTypeAngleRight() {
        assertEquals("Right Triangle - Angle A", "Right",
                        TriangleClassification.getTriangleTypeAngle(90, 30, 60));
    }
    // TODO Add 5 more test cases here for testGetTriangleTypeAngle method

    /**
     * Testing Invalid Triangle Angles
     */
    @Test
    public void testGetTriangleTypeAngleInvalid() {
        // Invalid test cases are provided for you. You do NOT
        // need to add additional invalid tests. Just make sure these
        // pass!
        try {
            TriangleClassification.getTriangleTypeAngle(0, 90, 90);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid Triangle - zero for A", "Not a valid triangle based on angles",
                            e.getMessage());
        }

        try {
            TriangleClassification.getTriangleTypeAngle(30, 30, 30);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid Triangle - sum 90", "Not a valid triangle based on angles",
                            e.getMessage());
        }
    }

}
