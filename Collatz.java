public class Collatz {
    public static void main(String[] args) {
                if (args.length < 2) {
                    System.out.println("Usage: java Collatz <N> <mode>");
                    return;
                }
        
                int N = Integer.parseInt(args[0]);
                String mode = args[1].toLowerCase();
        
                for (int seed = 1; seed <= N; seed++) {
                    int currentNumber = seed;
                    int stepCount = 1;
        
                    StringBuilder sequence = new StringBuilder();
        
                    while (currentNumber != 1) {
                        sequence.append(currentNumber).append(" ");
                        if (currentNumber % 2 == 0) {
                            currentNumber /= 2;
                        } else {
                            currentNumber = currentNumber * 3 + 1;
                        }
                        stepCount++;
                    }
                    sequence.append(1).append(" ");
        
                    if (mode.equals("v")) {
                        System.out.println(sequence.toString().trim() + " (" + stepCount + ")");
                    }
        
                    if (mode.equals("c")) {
                        System.out.println("Sequence for " + seed + " reached 1 in " + stepCount + " steps.");
                    }
                }
        
                System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
            }
        }