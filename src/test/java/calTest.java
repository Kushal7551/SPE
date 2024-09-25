// // import org.example.Calculator;
// // import org.junit.Test;
// // import org.junit.Assert;
// // public class CalculatorTest {

// //     // Test for factorial of a positive number
// //     @Test
// //     public void testFactorialPositive() {
// //         int observed = Calculator.factorial(5);
// //         int expected = 120;
// //         Assert.assertEquals(expected, observed);
// //     }

// //     // Test for factorial of zero
// //     @Test
// //     public void testFactorialZero() {
// //         int observed = Calculator.factorial(0);
// //         int expected = 1;
// //         Assert.assertEquals(expected, observed);
// //     }

// //     // Test for factorial of a negative number
// //     @Test
// //     public void testFactorialNegative() {
// //         int observed = Calculator.factorial(-5);
// //         int expected = -1;
// //         Assert.assertEquals(expected, observed);
// //     }

// //     // Test for square root of a positive number
// //     @Test
// //     public void testSqrtPositive() {
// //         double observed = Calculator.sqrt(16);
// //         double expected = 4.0;
// //         Assert.assertEquals(expected, observed, 1e-10);
// //     }

// //     // Test for square root of zero
// //     @Test
// //     public void testSqrtZero() {
// //         double observed = Calculator.sqrt(0);
// //         double expected = 0.0;
// //         Assert.assertEquals(expected, observed, 1e-10);
// //     }

// //     // Test for square root of a negative number
// //     @Test
// //     public void testSqrtNegative() {
// //         double observed = Calculator.sqrt(-10);
// //         double expected = -1;
// //         Assert.assertEquals(expected, observed, 1e-10);
// //     }

// //     // Test for natural logarithm (log)
// //     @Test
// //     public void testNaturalLog() {
// //         double observed = Calculator.log(Math.E);
// //         double expected = 1.0;
// //         Assert.assertEquals(expected, observed, 1e-10);
// //     }

// //     // Test for power function
// //     @Test
// //     public void testPowerFunction() {
// //         double observed = Calculator.pow(2, 3);
// //         double expected = 8.0;
// //         Assert.assertEquals(expected, observed, 1e-10);
// //     }
// // }

// import org.example.Main;
// import org.junit.Assert;
// import org.junit.Test;

// public class CalculatorTest {

//     @Test
//     public void testSquareRoot() {
//         double result = Main.SquareRoot(16);
//         Assert.assertEquals(4.0, result, 0.0001);

//         result = Main.SquareRoot(0);
//         Assert.assertEquals(0.0, result, 0.0001);

//         result = Main.SquareRoot(25);
//         Assert.assertEquals(5.0, result, 0.0001);
//     }

//     @Test
//     public void testFactorial() {
//         int result = Main.Factorial(5);
//         Assert.assertEquals(120, result);

//         result = Main.Factorial(0);
//         Assert.assertEquals(1, result);

//         result = Main.Factorial(1);
//         Assert.assertEquals(1, result);
//     }

//     @Test
//     public void testNaturalLog() {
//         double result = Main.NaturalLog(Math.E);
//         Assert.assertEquals(1.0, result, 0.0001);

//         result = Main.NaturalLog(1);
//         Assert.assertEquals(0.0, result, 0.0001);

//         Assert.assertThrows(IllegalArgumentException.class, () -> Main.NaturalLog(-5));
//     }

//     @Test
//     public void testPower() {
//         double result = Main.Power(2, 3);
//         Assert.assertEquals(8.0, result, 0.0001);

//         result = Main.Power(5, 0);
//         Assert.assertEquals(1.0, result, 0.0001);

//         result = Main.Power(0, 5);
//         Assert.assertEquals(0.0, result, 0.0001);

//         result = Main.Power(0, 0);  // Mathematical edge case
//         Assert.assertEquals(1.0, result, 0.0001);  // By definition, 0^0 is typically considered 1
//     }
// }

import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class calTest{
    private Main uncalculator;
    @Before
    public void setUp() {
        uncalculator = new Main();
    }
    @Test
    public void test_add() {
        double a = 2;
        double aa = 2;
        double expectedResult = 4;
        double result = uncalculator.add(a,aa);
        Assert.assertEquals(expectedResult, result,0.001);
    }

    @Test
    public void test_subt() {
        double a = 2;
        double aa = 2;
        double expectedResult = 0;
        double result = uncalculator.subt(a,aa);
        Assert.assertEquals(expectedResult, result,0.001);
    }

    @Test
    public void test_mul() {
        double a = 2;
        double aa = 2;
        double expectedResult = 4;
        double result = uncalculator.mul(a,aa);
        Assert.assertEquals(expectedResult, result,0.001);
    }

    @Test
    public void test_per() {
        double a = 2;
        double b = 5;
        double expectedResult = 2;
        double result = uncalculator.per(a,b);
        Assert.assertEquals(expectedResult, result,0.001);
    }
}