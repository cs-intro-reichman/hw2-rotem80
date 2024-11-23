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
                System.out.print(number + " ");

                while (number != 1) {
                    if (number % 2 == 0) {
                        number /= 2;
                    } else {
                        number = number * 3 + 1;
                    }
                    System.out.print(number + " ");
                    count++;
                }

                System.out.println("(" + (count + 1) + ")");
            }

            System.out.println("All sequences from 1 to " + limit + " reached 1.");
        } else {
            System.out.println("All sequences from 1 to " + limit + " reached 1.");
        }
    }
}