public class Calculator {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        double a = 5;
        double b = 10;
        double sum = cal.add (a, b);
        double odj = cal.subtract (a, b);
        double mno = cal.multiply (a, b);
        double dziel = cal.divide (a, b);
        System.out.println("a=" + a + " b= " + b);
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + odj);
        System.out.println("a * b = " + mno);
        System.out.println("a / b = " + dziel);

    }
}
