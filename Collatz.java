public class Collatz {
    public static void main(String[] args) {
        int highestSeed = Integer.parseInt(args[0]); 
        String mode = args[1];                         
        
        int currentSeed = 1;  
        
        if (mode.equals("v")) {
           for(int seed = 1; seed <= highestSeed; seed++) {  
              int stepCount = 1;  
              int currentNumber = seed;
              System.out.print(currentSeed + " ");  
  
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
           }
  
           System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
        } else {
           System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
        }
     }
  }