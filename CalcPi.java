public class CalcPi {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java CalcPi <iterations>");
            return;
        }

        int iterations = Integer.parseInt(args[0]);
        double piApproximation = 0.0;
        double denominator = 1.0;

        for (int i = 0; i < iterations; i++) {
            if (i % 2 == 0) {
                piApproximation += 1.0 / denominator;
            } else {
                piApproximation -= 1.0 / denominator;
            }
            denominator += 2.0;
        }

        double estimatedPi = piApproximation * 4.0;
        System.out.println("Pi according to Java: 3.141592653589793");
        System.out.printf("Approximated pi: %20.15f\n", estimatedPi);
    }
}