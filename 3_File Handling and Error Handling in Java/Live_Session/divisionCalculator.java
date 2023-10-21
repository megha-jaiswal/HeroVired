package Live_Session;

public class divisionCalculator {
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero error");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println (  e.getMessage());
}
}
}
    
