class Divider {
    static int divide(int x, int y) throws ArithmeticException {
        return x/y;
    }
}

public class ErrorHandling {
    public static void main(String[] args) {
        
        try {
            int value =  Divider.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }
}
