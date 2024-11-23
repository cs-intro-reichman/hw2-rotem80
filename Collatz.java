public class Collatz {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Collatz <numberOfSequences> <mode>");
            return;
        }
        
        int numberOfSequences = Integer.parseInt(args[0]);
        String mode = args[1];
        int startingNumber = 1;
  
        if (mode.equals("v")) {
            for (int sequenceIndex = 0; sequenceIndex < numberOfSequences; sequenceIndex++) {
                int stepCount = 1;
                int currentNumber = startingNumber;
                System.out.print(currentNumber + " ");
                
                do {
                    if (currentNumber % 2 != 0) {
                        currentNumber = currentNumber * 3 + 1;
                        System.out.print(currentNumber + " ");
                    } else {
                        currentNumber /= 2;
                        System.out.print(currentNumber + " ");
                    }
                    stepCount++;
                } while (currentNumber != 1);
                
                System.out.print("(" + stepCount + ")");
                System.out.println();
                startingNumber++;
            }
            System.out.println("Every one of the first " + numberOfSequences + " hailstone sequences reached 1.");
        } else {
            System.out.println("Every one of the first " + numberOfSequences + " hailstone sequences reached 1.");
        }
    }
}