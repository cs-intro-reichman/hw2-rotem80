public class Collatz {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Collatz <N> <mode>");
            return;
        }

        int numTerms = 0;
        try {
            numTerms = Integer.parseInt(args[0]); 
            if (numTerms <= 0) {
                System.out.println("N must be a positive integer.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for N. Please enter a positive integer.");
            return;
        }

        String displayMode = args[1].toLowerCase();

        for (int currentSeed = 1; currentSeed <= numTerms; currentSeed++) {
            int currentValue = currentSeed;
            int totalSteps = 1; 
            System.out.print(currentValue);

            while (currentValue != 1) {
                if (currentValue % 2 == 0) {
                    currentValue /= 2;
                } else {
                    currentValue = 3 * currentValue + 1;
                }
                System.out.print(" " + currentValue);
                totalSteps++;
            }

            if (displayMode.equals("v")) {
                System.out.println(" (" + totalSteps + ")");
            } else {
                System.out.println();
            }
        }
        
        if (displayMode.equals("c")) {
            System.out.println("Every one of the first " + numTerms + " hailstone sequences reached 1.");
        }
    }
}