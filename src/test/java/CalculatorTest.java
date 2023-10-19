import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    //summary
    @Test
    public void testSumIntInt(){
        Calculator calc1 = new Calculator();
        int actual = calc1.sum(100, 20);
        Assertions.assertEquals(120, actual);
    }
    @Test
    public void testSumIntDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.sum(100, 2.0);
        Assertions.assertEquals(102.0, actualSum);
    }
    @Test
    public void testSumDoubDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.sum(10.0, 2.5);
        Assertions.assertEquals(12.5, actualSum);
    }
    @Test
    public void testSumDoubInt(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.sum(10.8, 8);
        Assertions.assertEquals(18.8, actualSum);
    }
    @Test
    public void testSumZero(){
        Calculator calc1 = new Calculator();
        int actualSum = calc1.sum(0, 0);
        Assertions.assertEquals(0, actualSum);
    }
    @Test
    public void testSumMinus(){
        Calculator calc1 = new Calculator();
        int actualSum = calc1.sum(-100, 20);
        Assertions.assertEquals(-80, actualSum);
    }
    //subtraction
    @Test
    public void testSubtrIntInt(){
        Calculator calc1 = new Calculator();
        int actualSum = calc1.subtr(10, 5);
        Assertions.assertEquals(5, actualSum);
    }
    @Test
    public void testSubtrIntDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.subtr(100, 2.5);
        Assertions.assertEquals(97.5, actualSum);
    }
    @Test
    public void testSubtrDoubDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.subtr(100.5, 2.5);
        Assertions.assertEquals(98.0, actualSum);
    }
    @Test
    public void testSubtrDoubInt(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.subtr(100.5, 2);
        Assertions.assertEquals(98.5, actualSum);
    }
    @Test
    public void testSubtrZero() {
        Calculator calc1 = new Calculator();
        int actualSum = calc1.subtr(0, 0);
        Assertions.assertEquals(0, actualSum);
    }
    @Test
    public void testSubtrIMinus(){
        Calculator calc1 = new Calculator();
        int actualSum = calc1.subtr(-100, 20);
        Assertions.assertEquals(-120, actualSum);
    }
    //multiplication
    @Test
    public void testMultiplIntInt(){
        Calculator calc1 = new Calculator();
        int actualSum = calc1.multiply(10, 5);
        Assertions.assertEquals(50, actualSum);
    }
    @Test
    public void testMultiplIntDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.multiply(100, 2.5);
        Assertions.assertEquals(250, actualSum);
    }
    @Test
    public void testMultiplDoubDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.multiply(100.5, 2.5);
        Assertions.assertEquals(251.25, actualSum);
    }
    @Test
    public void testMultiplDoubInt(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.multiply(100.5, 5);
        Assertions.assertEquals(502.5, actualSum);
    }
    @Test
    public void testMultiplZero() {
        Calculator calc1 = new Calculator();
        int actualSum = calc1.multiply(0, 0);
        Assertions.assertEquals(0, actualSum);
    }
    @Test
    public void testMultiplIMinus(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.multiply(-100, 2.0);
        Assertions.assertEquals(-200, actualSum);
    }
    //division
    @Test
    public void testDivideIntInt(){
        Calculator calc1 = new Calculator();
        int actualSum = calc1.divide(10, 5);
        Assertions.assertEquals(2, actualSum);
    }
    @Test
    public void testDivideIntDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.divide(100, 2.5);
        Assertions.assertEquals(40, actualSum);
    }
    @Test
    public void testDivideDoubDoub(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.divide(100.5, 2.5);
        Assertions.assertEquals(40.2, actualSum);
    }
    @Test
    public void testDivideDoubInt(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.divide(100.5, 5);
        Assertions.assertEquals(20.1, actualSum);
    }
    @Test
    public void testDivideZero() {
        Calculator calc1 = new Calculator();
        int actualSum = calc1.divide(0, 1);
        Assertions.assertEquals(0, actualSum);
    }
    @Test
    public void testDivideMinus(){
        Calculator calc1 = new Calculator();
        double actualSum = calc1.divide(-100.8, 4);
        Assertions.assertEquals(-25.2, actualSum);
    }






}
