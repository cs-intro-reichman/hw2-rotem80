public class Collatz {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Collatz <N> <mode>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        String mode = args[1].toLowerCase();

        if (mode.equals("v")) {
            int var4 = 1;
            for (int var6 = 0; var6 < N; ++var6) {
                int currentNumber = var4;
                int stepCount = 1;

                System.out.print(currentNumber + " "); // הדפסת המספר הראשון

                do {
                    if (currentNumber % 2 != 0) {
                        currentNumber = currentNumber * 3 + 1;
                        System.out.print(currentNumber + " "); // הדפסת המספר לאחר הפעולה
                    } else {
                        currentNumber /= 2;
                        System.out.print(currentNumber + " "); // הדפסת המספר לאחר הפעולה
                    }
                    stepCount++;
                } while (currentNumber != 1);

                System.out.print("(" + stepCount + ")");
                System.out.println();
                var4++;
            }

            System.out.println("every one of the first " + N + " hailstone sequences reached 1.");
        } else {
            System.out.println("every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}