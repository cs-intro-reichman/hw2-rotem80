public class Collatz {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments: the limit and the mode (v/c).");
            return;
        }

        int limit = Integer.parseInt(args[0]);
        String mode = args[1];

        if (mode.equals("v")) {
            for (int startValue = 1; startValue <= limit; startValue++) {
                int number = startValue;
                int count = 0;
                StringBuilder sequence = new StringBuilder();

                while (number != 1) {
                    sequence.append(number).append(" ");
                    if (number % 2 == 0) {
                        number /= 2;
                    } else {
                        number = number * 3 + 1;
                    }
                    count++;
                }
                sequence.append("1");
                count++;

                System.out.println(sequence.toString() + " (" + count + ")");
            }

            System.out.println("Every one of the first " + limit + " hailstone sequences reached 1.");
        } else if (mode.equals("c")) {
            System.out.println("Every one of the first " + limit + " hailstone sequences reached 1.");
        } else {
            System.out.println("Invalid mode. Please use 'v' for verbose or 'c' for concise output.");
        }
    }
}