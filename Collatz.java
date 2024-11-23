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
                while (number != 1) {
                    System.out.print(number + " ");
                    if (number % 2 == 0) {
                        number /= 2;
                    } else {
                        number = 3 * number + 1;
                    }
                    count++;
                }
                System.out.println(number + " (" + count + ")");
            }
        } else if (mode.equals("c")) {
            for (int startValue = 1; startValue <= limit; startValue++) {
                int number = startValue;
                while (number != 1) {
                    number = (number % 2 == 0) ? number / 2 : 3 * number + 1;
                }
            }
        }

        System.out.println("Every one of the first " + limit + " hailstone sequences reached 1.");
    }
}