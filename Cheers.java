public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {  
            System.out.println("Error: Please provide a name and a number of repetitions.");
            return;  
        }

        String name = args[0];
        int numRepeats = Integer.parseInt(args[1]);  
        String upperName = name.toUpperCase();
        String vowels = "AEFHILMNORSX";

        for (int i = 0; i < upperName.length(); i++) {
            char ch = upperName.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                System.out.println("Give me a " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < numRepeats; i++) { 
            System.out.println(upperName + "!!!");
        }
    }
}