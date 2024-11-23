public class CalcPi {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the number of iterations as an argument.");
            return;
        }

        int iterations = 0;
        try {
            iterations = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
            return;
        }

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
