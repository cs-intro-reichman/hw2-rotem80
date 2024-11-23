public class CalcPi {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        double approximation = 0.0;
        double denominator = 1.0;

        for (int i = 0; i < iterations; i++) {
            if (i % 2 == 0) {
                approximation += 1.0 / denominator;
            } else {
                approximation -= 1.0 / denominator;
            }
            denominator += 2.0;
        }

        System.out.println("Actual value of pi: 3.141592653589793");
        System.out.println("Approximated pi: " + approximation * 4.0);
    }
}