public class CalcPi {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java CalcPi <numTerms>");
            return;
        }

        int numTerms = Integer.parseInt(args[0]);
        double piApproximation = 0;

        for (int i = 0; i < numTerms; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                piApproximation += term;
            } else {
                piApproximation -= term;
            }
        }

        piApproximation *= 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + piApproximation);
    }
}