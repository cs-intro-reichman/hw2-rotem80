public class Collatz {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Usage: java Collatz <N> <mode>");
            return;
        }
        int N = 0;
        try {
            N = Integer.parseInt(args[0]);
            if (N <= 0) {
                System.out.println("N must be a positive integer.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for N. Please enter a positive integer.");
            return;
        }
        String mode = args[1].toLowerCase();
        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;  
            System.out.print(current);
            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = 3 * current + 1;
                }
                System.out.print(" " + current);
                steps++;
            }
            if (mode.equals("v")) {
                System.out.println(" (" + steps + ")");
            } else {
                System.out.println();
            }
        }
        if (mode.equals("c")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}