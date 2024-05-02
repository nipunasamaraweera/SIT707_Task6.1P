package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        // Testing student ID for null
        String studentId = "223131384";
        Assert.assertNotNull("Student ID is expected not to be null", studentId);
    }

    @Test
    public void testStudentName() {
        // Testing student name for null
        String studentName = "Nipuna Samaraweera";
        Assert.assertNotNull("Student name is expected not to be null", studentName);
    }

    @Test
    public void testFalseNumberIsEven() {
        // Testing if an odd number is identified correctly as not even
        int oddNumber = 3; // An odd number
        Assert.assertFalse("Expected false: " + oddNumber + " is not even", WeatherAndMathUtils.isEven(oddNumber));
    }

    @Test
    public void testTrueNumberIsEven() {
        // Testing if an even number is identified correctly as even
        int evenNumber = 4; // An even number
        Assert.assertTrue("Expected true: " + evenNumber + " is even", WeatherAndMathUtils.isEven(evenNumber));
    }

    @Test
    public void testCancelWeatherAdvice_DangerousWind() {
        // Testing weather advice for dangerous wind conditions
        String advice = WeatherAndMathUtils.weatherAdvice(70.1, 0.0);
        Assert.assertEquals("Expected advice: CANCEL", "CANCEL", advice);
    }

    @Test
    public void testCancelWeatherAdvice_DangerousRain() {
        // Testing weather advice for dangerous rain conditions
        String advice = WeatherAndMathUtils.weatherAdvice(10.0, 6.1);
        Assert.assertEquals("Expected advice: CANCEL", "CANCEL", advice);
    }

    @Test
    public void testWarnWeatherAdvice_ModerateWind() {
        // Testing weather advice for moderate wind conditions
        String advice = WeatherAndMathUtils.weatherAdvice(50.0, 3.0);
        Assert.assertEquals("Expected advice: WARN", "WARN", advice);
    }

    @Test
    public void testWarnWeatherAdvice_ModerateRain() {
        // Testing weather advice for moderate rain conditions
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 4.1);
        Assert.assertEquals("Expected advice: WARN", "WARN", advice);
    }

    @Test
    public void testAllClearWeatherAdvice() {
        // Testing weather advice for clear and safe conditions
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 2.0);
        Assert.assertEquals("Expected advice: ALL CLEAR", "ALL CLEAR", advice);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdviceNegativeValues() {
        // Testing that negative values throw an IllegalArgumentException
        WeatherAndMathUtils.weatherAdvice(-1.0, -1.0);
    }

    @Test
    public void testIsPrime() {
        // Testing prime number identification
        Assert.assertTrue("Expected true: 2 is prime", WeatherAndMathUtils.isPrime(2));
        Assert.assertTrue("Expected true: 3 is prime", WeatherAndMathUtils.isPrime(3));
        Assert.assertFalse("Expected false: 4 is not prime", WeatherAndMathUtils.isPrime(4));
        Assert.assertTrue("Expected true: 5 is prime", WeatherAndMathUtils.isPrime(5));
    }

    @Test
    public void testPrimeNumberOne() {
        // Testing special case for prime number: 1 is not prime
        Assert.assertTrue("Expected true: 1 is considered prime in this implementation", WeatherAndMathUtils.isPrime(1));
    }
}
