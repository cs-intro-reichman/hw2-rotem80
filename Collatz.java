public class Collatz {
    public static void main(String[] args) {
        int maxSeed = Integer.parseInt(args[0]);
        String mode = args[1];
        int seed = 1;

        if (mode.equals("v")) {
            for (int i = 0; i < maxSeed; i++) {
                int count = 1;
                int number = seed;
                System.out.print(number + " ");

                while (number != 1) {
                    if (number % 2 != 0) {
                        number = number * 3 + 1;
                    } else {
                        number /= 2;
                    }
                    System.out.print(number + " ");
                    count++;
                }
                System.out.println("(" + count + ")");
                seed++;
            }
            System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
        } else {
            System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
        }
    }
}