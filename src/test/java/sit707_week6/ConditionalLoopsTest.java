package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsTest {

    @Test
    public void testCountEvenNumbers() {
        // Test counting even numbers in an array
        int[] numbers = {1, 2, 3, 4, 5};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals("Expected number of even numbers is 2", 2, result);
    }

    @Test
    public void testContainsPrime() {
        // Test if an array contains at least one prime number
        int[] numbers = {4, 6, 8, 9, 11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue("Expected true because 11 is prime", result);
    }

    @Test
    public void testDoesNotContainPrime() {
        // Test if an array contains no prime numbers
        int[] numbers = {4, 6, 8, 9, 10};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertFalse("Expected false because there are no prime numbers", result);
    }
}
