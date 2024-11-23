public class Collatz {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean flag = true;
        int start = 1;

        if (mode.equals("v")) {
            for (int i = 0; i < number; i++) {
                int steps = 1;
                int current = start;
                System.out.print(current + " ");

                do {
                    if (current % 2 != 0) {
                        current = current * 3 + 1;
                        System.out.print(current + " ");
                    } else {
                        current /= 2;
                        System.out.print(current + " ");
                    }

                    steps++;
                } while (current != 1);

                System.out.print("(" + steps + ")");
                System.out.println();
                start++;
            }

            System.out.println("Each of the first " + number + " hailstone sequences reached 1.");
        } else {
            System.out.println("Each of the first " + number + " hailstone sequences reached 1.");
        }
    }
}