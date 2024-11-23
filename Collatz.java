public class Collatz {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Collatz <numberOfSequences> <mode>");
            return;
        }

        int numberOfSequences = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= numberOfSequences; seed++) {
            int currentNumber = seed;
            int stepCount = 1;

            if (mode.equals("v")) {
                System.out.print(currentNumber + " ");
                while (currentNumber != 1) {
                    if (currentNumber % 2 == 0) {
                        currentNumber /= 2;
                    } else {
                        currentNumber = currentNumber * 3 + 1;
                    }
                    System.out.print(currentNumber + " ");
                    stepCount++;
                }
                System.out.println("(" + stepCount + ")");
            } else if (mode.equals("c")) {
                while (currentNumber != 1) {
                    if (currentNumber % 2 == 0) {
                        currentNumber /= 2;
                    } else {
                        currentNumber = currentNumber * 3 + 1;
                    }
                    stepCount++;
                }
            }
        }

        System.out.println("Every one of the first " + numberOfSequences + " hailstone sequences reached 1.");
    }
}