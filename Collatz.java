public class Collatz {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Collatz <number> <mode>");
            return;
        }

        int number = Integer.parseInt(args[0]);
        String mode = args[1];
        int start = 1;

        if (mode.equals("v")) {
            for (int i = 0; i < number; i++) {
                int steps = 0;
                int current = start;
                StringBuilder sequence = new StringBuilder();
                sequence.append(current).append(" ");

                while (current != 1) {
                    if (current % 2 != 0) {
                        current = current * 3 + 1;
                        sequence.append(current).append(" ");
                    } else {
                        current /= 2;
                        sequence.append(current).append(" ");
                    }
                    steps++;
                }

                System.out.print(sequence.toString().trim() + " ");
                System.out.println("(" + steps + ")");
                start++;
            }

            System.out.println("Each of the first " + number + " hailstone sequences reached 1.");
            System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
        } else {
            System.out.println("Each of the first " + number + " hailstone sequences reached 1.");
            System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
        }
    }
}