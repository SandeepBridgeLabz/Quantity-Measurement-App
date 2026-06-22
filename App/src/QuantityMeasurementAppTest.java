import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuantityMeasurementAppTest {

    @Test
    public void testEquality_SameValue() {
        // Given
        QuantityMeasurementApp.Feet feet1 =
                new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 =
                new QuantityMeasurementApp.Feet(1.0);

        // When & Then
        assertTrue("1.0 ft should be equal to 1.0 ft",
                feet1.equals(feet2));
    }

    @Test
    public void testEquality_DifferentValue() {
        // Given
        QuantityMeasurementApp.Feet feet1 =
                new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 =
                new QuantityMeasurementApp.Feet(2.0);

        // When & Then
        assertFalse("1.0 ft should not be equal to 2.0 ft",
                feet1.equals(feet2));
    }

    @Test
    public void testEquality_NullComparison() {
        // Given
        QuantityMeasurementApp.Feet feet =
                new QuantityMeasurementApp.Feet(1.0);

        // When & Then
        assertFalse("Feet object should not be equal to null",
                feet.equals(null));
    }

    @Test
    public void testEquality_NonNumericInput() {
        // Given
        QuantityMeasurementApp.Feet feet =
                new QuantityMeasurementApp.Feet(1.0);

        // When & Then
        assertFalse("Feet object should not be equal to a String",
                feet.equals("1.0"));
    }

    @Test
    public void testEquality_SameReference() {
        // Given
        QuantityMeasurementApp.Feet feet =
                new QuantityMeasurementApp.Feet(1.0);

        // When & Then
        assertTrue("Object should be equal to itself",
                feet.equals(feet));
    }
}