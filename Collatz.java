public class Collatz {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;  

      
            System.out.print(current);

          
            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = 3 * current + 1;
                }
                System.out.print(" " + current);
                steps++;  
            }

            if (mode.equals("v")) {
                System.out.println(" (" + steps + ")");
            } else {
                System.out.println();
            }
        }

       
        if (mode.equals("c")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}
