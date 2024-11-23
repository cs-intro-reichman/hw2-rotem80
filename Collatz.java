public class Collatz {
    public static void main(String[] args) {
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
                    } else {
                        current /= 2;
                    }
                    sequence.append(current).append(" ");
                    steps++;
                }

                System.out.print(sequence.toString().trim() + " (" + (steps + 1) + ")");
                System.out.println();
                start++;
            }

            System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
        } else {
            System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
        }
    }
}